class Solution {
    // we check row for duplicates -- rowset
    // col for duplicates -- colset
    // each box for duplicates--isBoardValid

    public boolean isValidSudoku(char[][] b) {
        if(b.length>9 || b[0].length>9)
        return false; 

        Set<Character> rowset; 
        Set<Character> colset; 

        for(int i=0;i<9; i=i+3)
            for(int j=0;j<9 ; j=j+3)
                if(!isBoardValid(b, i, j))
                    return false; 

        for(int i=0;i<9; i++){
            rowset = new HashSet<>(); 
            colset=new HashSet<>(); 
            for(int j=0;j<9;j++){

                //rows 
                if(b[i][j] != '.' && rowset.contains(b[i][j]))  
                    return false; 
                else if (b[i][j] != '.' && !rowset.contains(b[i][j]))
                    rowset.add(b[i][j]);

                //columns
                if(b[j][i] != '.' && colset.contains(b[j][i]))  
                    return false; 
                else if (b[j][i] != '.' && !colset.contains(b[j][i]))
                    colset.add(b[j][i]);

            }
        }
    



    return true; 

    }

    // checking the box for duplicates
    public boolean isBoardValid(char[][] b, int row, int col) {
        Set<Character> set = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (b[i][j] != '.' && set.contains(b[i][j]))
                    return false;
                else if (b[i][j] != '.' && !set.contains(b[i][j]))
                    set.add(b[i][j]);
            }
        }

        return true;
    }
}