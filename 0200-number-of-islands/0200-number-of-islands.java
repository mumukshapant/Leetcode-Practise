class Solution {
    
    public int numIslands(char[][] g) {
        int m= g.length; 
        int n= g[0].length; 
        int count=0; 
       
       

        for(int i=0;i<m;i++){
            for(int j=0;j<n; j++){
                if(g[i][j]=='1')
              { dfs(g, i, j); 
               count++; }
            }
        }
        return count; 
        
    }

    private int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    private void dfs(char[][] g, int r, int c) {
        int m = g.length;
        int n = g[0].length;

        if (r >= m || c >= n || r < 0 || c < 0 || g[r][c] != '1')
            return;

        g[r][c]=2; //mark visited

        for (int[] d : directions) {
            int newrow = r + d[0];
            int newcol = c + d[1];

            dfs(g, newrow, newcol);
         
        }
     
    }
}