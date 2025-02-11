class Solution {
    public int orangesRotting(int[][] g) {

        int m = g.length;
        int n = g[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshorange=0; 

        // 0 representing an empty cell,
        // 1 representing a fresh orange, or
        // 2 representing a rotten orange.

        for(int i=0;i<m; i++){
            for(int j=0;j<n;j++){

                if(g[i][j]==2) //rotten
                    q.offer(new int[]{i, j, 0}); 
                
                
                else if(g[i][j]==1) //fresh
                    freshorange++ ;
            }
        }

        if(freshorange==0)
            return 0; 

        return bfs(g, freshorange , q); 

    }

    private int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };


    private int bfs(int[][] g, int freshorange, Queue<int[]> q) {

        int m = g.length;
        int n = g[0].length;
        int currtime=0; 
    

        while(!q.isEmpty()){
            int[] curr= q.poll(); 
            
            int currow=curr[0]; 
            int currcol=curr[1]; 
            currtime= curr[2];

           //curr ke 4 directions mein jaao , agar gresh hai, toh usse rotten kardo
           for(int[] d:directions){
            int newrow=currow+d[0]; 
            int newcol= currcol+d[1];

            if(newrow<0 || newrow>=m || newcol<0 || newcol>=n 
                || g[newrow][newcol] != 1 )
                    continue; 

            // time++; 
            q.offer(new int[]{newrow, newcol, currtime+1});

            //mark visited --rotten
            g[newrow][newcol] = 2;

            freshorange-- ; 
           }

        }
        
        return freshorange == 0 ? currtime : -1;



    }

}