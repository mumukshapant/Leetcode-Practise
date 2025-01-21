class Solution {
    int count;
    public int numIslands(char[][] g) {

        int m= g.length; 
        int n= g[0].length; 
        count = 0; 

        for(int i=0;i<m; i++){
            for(int j=0;j<n;j++)
                if(g[i][j]=='1')
                {
                    helper(g, i, j); 
                    count++; 
                }
                    
        }

        return count; 
        
    }

    // this helper function is used for exploring the island -- not counting it.. 
    
    private int helper(char[][]g, int r, int c )
    {

        int m= g.length; 
        int n= g[0].length; 

        // conditions...dfs will run only on land
        if(r<0 || c<0 || r>=m || c>=n || g[r][c]!='1' ) 
            return 0; 
        
        // mark visited 
        g[r][c] = '2'; 

        for(int[] d: directions){
            int newrow= d[0]+r; 
            int newcol= d[1]+c; 

            helper(g, newrow, newcol);
        }
        return count ;
        
    }
    int[][] directions= new int[][]{{-1,0}, {1,0},{0,1}, {0,-1}};
}