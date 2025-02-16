class Solution {
    public boolean isValidSudoku(char[][] b) {
        int m = b.length;
        int n = b[0].length;
        Set<Character> rowset;
        Set<Character> colset;

        for(int i=0;i<m; i=i+3){
            for(int j=0;j<n; j=j+3){
                if(!isBoxValid(b, i, j))
                    return false; 
            }
        }

        for (int row = 0; row < m; row++) {
            rowset = new HashSet<>();

            for (int i = 0; i < m; i++) {
                if (b[row][i] == '.')
                    continue;

                if (rowset.contains(b[row][i]))
                    return false;
                else
                    rowset.add(b[row][i]);
            }
        }

        for(int col=0;col<n; col++){
            colset= new HashSet<>(); 

            for(int i=0;i<n; i++){
                if(b[i][col]=='.')
                    continue; 
                if(colset.contains(b[i][col]))
                    return false; 
                else
                    colset.add(b[i][col]);
            }
        }
        return true; 


    }

    private boolean isBoxValid(char[][] b, int row, int col) {

        Set<Character> set= new HashSet<>();
        for(int i= row; i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(b[i][j]=='.')
                    continue; 
                
                if(set.contains(b[i][j]))
                    return false; 
            }
        }
        return true; 

    }
}