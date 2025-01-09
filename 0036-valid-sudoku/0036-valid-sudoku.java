class Solution {
    public boolean isValidSudoku(char[][] b) {

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

        for(int square= 0; square<9;square++){
            Set<Character> seen= new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for(int j=0; j<3; j++){

                    int row= (square/3)*3 + i ; 
                    int col= (square%3)*3 +j; 

                    if(b[row][col]=='.')
                        continue; 
                    
                    if (seen.contains(b[row][col])) 
                        return false;

                    seen.add(b[row][col]);
                }
            }
        }


    return true; 


    // We will have a unique hashset for every single row 
    
    // row = row%3  WRONG because if row 2 col 2 then 2%3 gives 2 not 0 . therfore integer division . not mod. 
    }
}