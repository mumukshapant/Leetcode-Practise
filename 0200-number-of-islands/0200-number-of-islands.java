class Solution {
    int count;
    int n, m;

    public int numIslands(char[][] grid) {
        n = grid.length; 
        if (n == 0) return 0;
        m = grid[0].length;
        count = 0; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    callbfs(grid, i, j); 
                    count++; 
                }
            }
        }

        return count; 
    }

    public void callbfs(char[][] grid, int i, int j) {
        // Boundary checks
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1')
            return;

        // Mark the cell as visited by setting it to '0'
        grid[i][j] = '0';

        // Recursively visit all adjacent cells
        callbfs(grid, i, j + 1);
        callbfs(grid, i, j - 1); 
        callbfs(grid, i + 1, j); 
        callbfs(grid, i - 1, j); 
    }
}
