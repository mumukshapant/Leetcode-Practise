class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[heights.length];

        for (int i = heights.length - 1, j = 0; i >= 0; i--) {

            res[i] = map.get(heights[j]);
            j++;

        }
        return res;
    }
}