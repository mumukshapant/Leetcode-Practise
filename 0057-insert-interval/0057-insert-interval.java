class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {


        List<int[]> allIntervals = new ArrayList<>(Arrays.asList(intervals));


        allIntervals.add(newInterval);

        allIntervals.sort(Comparator.comparingInt(a -> a[0]));

        List<int[]> res = new ArrayList<>();


        int[] prev = allIntervals.get(0);
        res.add(prev);

        for (int[] interval : allIntervals) {
            int currentEnd = prev[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];


            if (currentEnd >= nextBegin) {
                prev[1] = Math.max(currentEnd, nextEnd);
            } else {
                prev = interval;
                res.add(prev);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}