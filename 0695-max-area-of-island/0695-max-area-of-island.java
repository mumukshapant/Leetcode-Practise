class Solution {
    int area=1; 
    public int maxAreaOfIsland(int[][] g) {
        int m= g.length; 
        int n= g[0].length; 
        int maxarea=0; 

        for(int i=0;i<m; i++){
            for(int j=0;j<n;j++){
                 maxarea=Math.max( dfs(g, i, j), maxarea); 
            }
        }
       
        return maxarea; 


        
    }
    private int[][] directions=new int[][]{{-1,0},{0,1},{0,-1},{1,0}}; 
    
    private int dfs(int[][]g, int i, int j){
        int m= g.length; 
        int n= g[0].length; 
       // int[][] vis= new int[m][n];
       int area=1; 

        if( i>=m || j>=n || i<0 || j<0 || g[i][j] !=1 )
            return 0 ; 
        
         g[i][j]=2; 

        for(int[] d: directions){
            
            int newrow= d[0] + i; 
            int newcol= d[1] + j; 

            
           area+= dfs(g, newrow, newcol);

        }
        return area; 


    }
}