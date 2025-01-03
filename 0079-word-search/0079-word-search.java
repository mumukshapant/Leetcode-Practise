class Solution {
    boolean[][] visited; 
    public boolean exist(char[][] board, String s) {

        int x=board.length, y= board[0].length; 
        visited= new boolean[x][y];

     for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
         if(search(board, s, i, j,0 ))
            return true; 
        }
     }   

     return false; 
    }

    boolean search(char[][] board, String s, int row, int col, int index) {


    if(index==s.length()) //found the full word
        return true;
        

    // If word is already visited, or curr character is not same, or row col out of bounds, return FALSE. 
    if(row<0 || row>=board.length || col<0 || col>=board[0].length ||
    s.charAt(index)!=board[row][col]|| visited[row][col])    
        return false; 


    visited[row][col] = true;


// search 4 directions: Left, Right, Up, Down
    if ((search(board, s, row + 1, col, index + 1)) ||
            (search(board, s, row-1, col , index + 1)) ||
            (search(board, s, row, col+1, index + 1)) ||
            (search(board, s, row, col-1, index + 1))) {
      return true;
    }

    visited[row][col] = false;


    return false;
  }





}