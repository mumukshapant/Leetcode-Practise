class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowset=new HashSet<>(); 
        Set<Character> colset=new HashSet<>(); 

        for(int i=0;i<board.length; i++){
            colset=new HashSet<>(); 
            rowset= new HashSet<>(); 

            for(int j=0;j<board[0].length ; j++){
                if(board[i][j]!='.' && rowset.contains(board[i][j]))
                    return false; 

                else    
                    rowset.add(board[i][j]); 

                if(board[j][i]!='.' && colset.contains(board[j][i]))
                    return false; 

                else    
                    colset.add(board[j][i]); 
            }
        }

        for(int i=0;i<9;i=i+3)
            for(int j=0;j<9; j=j+3)
                if(!isBoardValid(board, i, j))
                    return false; 


    return true; 
        
    }
    public boolean isBoardValid(char[][] b, int row, int col){
            HashSet<Character> set = new HashSet<>();

        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){

                if(!set.contains(b[i][j]))
                    set.add(b[i][j]); 
                
                else if(b[i][j]!='.')
                    return false; 

                
            }
        }

        return true; 
    }
}