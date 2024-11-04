class Solution {
    public int[][] kClosest(int[][] nums, int k) {

        // [ (x2-x1)^2 + ( y2-y21)^2 ] ^(-1/2)
                int[][] distances = new int[nums.length][3];


        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i][0];
            int y = nums[i][1];

            int dist = x * x +  y * y;

            distances[i][0] = dist;
            distances[i][1] = x;
            distances[i][2] = y;
        }
        Arrays.sort(distances, (a, b) -> Integer.compare(a[0], b[0]));
        // k closest points
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i][0] = distances[i][1];
            result[i][1] = distances[i][2];
        }
        return result;

    }
}