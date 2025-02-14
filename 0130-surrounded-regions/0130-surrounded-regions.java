class Solution {
    public void solve(char[][] g) {
        int m= g.length; 
        int n= g[0].length; 
        int[][] vis= new int[m][n];

        // start from the boundary of Os and mark them 
        // that will not be converted and convert the remaining Os

        //go to all the boundary. Find the first O

        // 0th row.. verified
        for(int i=0;i<n;i++){
            if(vis[0][i]==0 && g[0][i]=='O')
            {
                dfs(g, 0, i,vis); 

            }
        }

        //0th column..
        for(int i=0;i<m;i++){
            if(vis[i][0]==0 && g[i][0]=='O')
            {
                dfs(g, i, 0,vis); 

            }
        }

        //last row verified
        for(int i=0;i<n;i++){
            if( vis[m-1][i]==0 && g[m-1][i]=='O')
            {
                dfs(g, m-1, i,vis); 

            }
        }

        // last column 
        for(int i=0;i<m;i++){
            if(vis[i][n-1]==0 && g[i][n-1]=='O')
            {
                dfs(g, i, n-1, vis); 

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && g[i][j]=='O')
                    g[i][j]='X';
            }
        }


        
    }
    private int[][]directions=new int[][]{{-1,0},{1,0},{0,1},{0,-1}}; 

    private void dfs(char[][] g, int i, int j, int[][] vis){

        int m= g.length; 
        int n= g[0].length; 
        //int[][] vis = new int[m][n]; 

         vis[i][j]=1; 

        for(int[] d: directions){
            int newrow= d[0] + i ; 
            int newcol= d[1]+j ; 

            if(newrow<m && newcol<n 
            && newrow>=0  && newcol>=0 
            && g[newrow][newcol]=='O'
            && vis[newrow][newcol]==0)
            {
             
                dfs(g, newrow, newcol, vis); 


            }
                
        }

    
    }
}