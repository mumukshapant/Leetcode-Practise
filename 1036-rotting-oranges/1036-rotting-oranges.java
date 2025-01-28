class Solution {
    public int orangesRotting(int[][] g) {

        int m = g.length;
        int n = g[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshorange=0; 

        for(int i=0;i<m; i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==2) //if rotten 
                    q.offer(new int[] {i, j , 0 }); // r, c, time
                else if ( g[i][j]==1)  // fresh orange 
                    freshorange++; 
            }
        }

        if (freshorange == 0)
            return 0;
        
        return bfs(g, q, freshorange); 


    }

    private int bfs(int[][] g, Queue<int[]> q, int freshorange) {
        int m = g.length; 
        int n =g[0].length; 

        int curr_time=0; 


        while(!q.isEmpty()){

            int[] curr= q.poll(); 

            int curr_row= curr[0]; 
            int curr_col = curr[1]; 
            curr_time = curr[2]; 

            for(int[] d: directions){

                int newrow = d[0] + curr_row;
                int newcol = d[1] + curr_col; 

                if(newrow<0 || newrow>=m || newcol<0 || newcol>=n 
                || g[newrow][newcol] != 1 )
                    continue; 
                
                q.offer(new int[] {newrow, newcol, curr_time+1});

                g[newrow][newcol]=2; //make it rotten ( visited)
                freshorange--;  

            }

        }

        return freshorange == 0 ? curr_time : -1;
    }

        private int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

}