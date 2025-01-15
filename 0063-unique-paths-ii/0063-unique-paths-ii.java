class Solution {
    public int uniquePathsWithObstacles(int[][] g) {
        int m = g.length;
        int n = g[0].length;

        int[][] dp = new int[m][n];


        //  start or end cell has an obstacle, no path is possible
        if (g[0][0] == 1 || g[m - 1][n - 1] == 1) {
            return 0;
        }
        
        dp[0][0] = 1; // if there is no obstacle at 0,0  ,there is only 1 way o start



        for (int i = 1; i < m; i++) {
            if (g[i][0] == 1)
                dp[i][0] = 0;

            else
                dp[i][0]= dp[i - 1][0];  // why are we initalising to i-1, 0 instead of dp[i][j]=1 ? 
                //because ---- take this example ( end of program )

        }

        for (int i = 1; i < n; i++) {
            if (g[0][i] == 1)
                dp[0][i] = 0;

            else
                dp[0][i] = dp[0][i - 1]; // Only one way to move right

        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (g[i][j] == 1) // obstacle
                    dp[i][j] = 0;

                else {
                    int up = dp[i - 1][j];
                    int left = dp[i][j - 1];

                    dp[i][j] = up + left;
                }

            }
        }

        return dp[m - 1][n - 1];

    }
}

// grid =
//  [0]   0,0
//  [0]   1,0
//  [1]   2,0       //obstacle 
//  [0]   3,0

// mark dp[0][0]=1 

// we move down from 0,0 to 1,0 dp[i][j]= dp[i-1][j]=1
// then from 1,0 we move down dp[i][j]=1     dp[i-1][j]=1
// then there is obstacle at [2,0] which means we cannot go down. so dp[i][j]=0
// then we cannot reach 3 because previous row is 0.


// IF we had marked it as 1 , that would be incorrect