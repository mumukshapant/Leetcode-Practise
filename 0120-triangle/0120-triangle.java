class Solution {
    public int minimumTotal(List<List<Integer>> t) {

        int n = t.size();

        // base case --only 1 row
        if (n == 1)
            return t.get(0).get(0);

        int[][] dp = new int[n][n];

        // only 1 column
        // return t.get(0).get(0);
        dp[0][0] = t.get(0).get(0);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                int up = Integer.MAX_VALUE;
                int diagonal = Integer.MAX_VALUE;

                // System.out.println("i value: "+i);
                // System.out.println("j value: "+j);

                if (j < i)
                    up = dp[i - 1][j];
                // System.out.println("up value: "+up);

                if (j > 0)
                    diagonal = dp[i - 1][j - 1];
                // System.out.println("diagonal value: "+diagonal);

                dp[i][j] = Math.min(up, diagonal) + t.get(i).get(j);
                // System.out.println("curr box value: "+dp[i][j]);

            }
        }

        // the result is minimum of last row of DP [ 15, 11 , 18, 16 ]
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < dp.length; i++)
            min = Math.min(dp[n - 1][i], min);

        return min;

    }
}