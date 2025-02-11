class Solution {
   
    public int maxAreaOfIsland(int[][] g) {

        int m= g.length; 
        int n= g[0].length; 

        int res=0; 
       

        for(int i=0;i<m;i++){
            for(int j=0;j<n; j++){
                res= Math.max(dfs(g, i, j), res); 
            }
        }
        return res ; 
        
    }
      private int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    private int dfs(int[][] g, int r, int c) {
        int m = g.length;
        int n = g[0].length;
        int area=1; 
        

        if (r >= m || c >= n || r < 0 || c < 0 || g[r][c] != 1)
            return 0 ;

        

        g[r][c]=2; //mark visited

        for (int[] d : directions) {
            int newrow = r + d[0];
            int newcol = c + d[1];

            area+=dfs(g, newrow, newcol);
         
        }
        return area; 
    }
     
}