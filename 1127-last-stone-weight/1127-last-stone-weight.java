class Solution {
    public int lastStoneWeight(int[] nums) {

        List<Integer> l = new ArrayList<>();
        for (int i : nums)
            l.add(i);
        int x = 0;
        int y = 0;

        while(l.size()>1) {
                    Collections.sort(l, Collections.reverseOrder());

            x = l.get(0);
            y = l.get(1);
            if (x != y) {
                l.remove(0);
                l.remove(0);
                l.add(x-y);
            }if(x==y){
                l.remove(0);
                l.remove(0);

            }

        }
        return l.isEmpty() ? 0 : l.get(0);

    }
}