class Solution {
    public void gameOfLife(int[][] board) {
        int m= board.length; 
        int n= board[0].length; 
// cell ==1 <2 live neighbours --- dead 
// cell ==1, ==2 || ==3 live neighbours --- lives
// cell ==1, >3 live neighbours  --- dies 
// cell ==0 , ==3 live ---- lives 

int[][] res= new int[m][n]; 

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                int count=livecell(board, m,  n, i, j);
                if(board[i][j]==1 && count<2 )
                    res[i][j]=0;

                if ((board[i][j]==1 && count==2 )|| (board[i][j]==1  && count==3))
                    res[i][j]=1; 
                
                if(board[i][j]==1 && count>3)
                    res[i][j]=0;

                if(board[i][j]==0 && count==3 )
                    res[i][j]=1;
            }
        }

        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
            board[i][j]=res[i][j];
        }
        
    }
   public int[][] dir= new int[][]{{-1,-1}, {-1,0}, {-1,1}, 
   {0,-1}, {0,1} ,{1,-1}, {1,0},{1,1}}; 

    private int livecell(int board[][], int m, int n, int r, int c){
        int count=0;
  

        for(int i=0;i<dir.length;i++)
        {
                     int newrow= r+dir[i][0]; 
                     int newcol=c+dir[i][1]; 

                    if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && board[newrow][newcol]==1){
                        count++ ;
                    }

        }


        return count ; 
    }
}

