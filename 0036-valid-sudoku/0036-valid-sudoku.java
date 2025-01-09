class Solution {
    public boolean isValidSudoku(char[][] b) {

        for(int i=0;i<9; i=i+3)
            for(int j=0;j<9 ; j=j+3)
                if(!isBoxValid(b, i, j))
                    return false; 

        for (int row = 0; row < 9; row++) {            
            Set<Character> rowset= new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if(b[row][i]=='.')
                    continue ;
                
                if(rowset.contains(b[row][i]))
                    return false; 
                rowset.add(b[row][i]);
            }
        }


          for (int col = 0; col < 9; col++) {            
            Set<Character> colset= new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if(b[i][col]=='.')
                    continue ;
                
                if(colset.contains(b[i][col]))
                    return false; 
                colset.add(b[i][col]);
            }
        }


    return true; 


    // We will have a unique hashset for every single row 
    
    // row = row%3  WRONG because if row 2 col 2 then 2%3 gives 2 not 0 . therfore integer division . not mod. 
    }

    private boolean isBoxValid(char[][]b, int row, int col){
        Set<Character> set = new HashSet<>();

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if(b[i][j]=='.')
                    continue; 
                
                if ( set.contains(b[i][j]) )
                    return false;
                
                set.add(b[i][j]);
            }
        }
            return true; 

    }
}