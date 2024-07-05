class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        long n = grid.length;
        long N = n * n;
        long sum = 0, sumOfSquare = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                sumOfSquare += grid[i][j] * grid[i][j];
            }
        }

        // Calculate the difference between the sum of squares and the expected sum of squares
        long x = sumOfSquare - sumOfSquares(N);
        // Calculate the difference between the sum and the expected sum
        long y = sum - sigma(N);

        // Calculate the sum of the missing and repeated numbers
        long z = x / y;

        // z = a + b, y = a - b
        // Solve for a and b
        long a = (z + y) / 2;
        long b = (z - y) / 2;

        int[] res = new int[2];
        res[0] = (int) a; // missing number
        res[1] = (int) b; // repeated number

        return res;
    }

    private long sigma(long n) {
        return (n * (n + 1)) / 2;
    }

    private long sumOfSquares(long n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
}
