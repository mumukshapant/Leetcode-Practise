class Solution {

    boolean[][] visited; 

    public boolean exist(char[][] b, String w) {
        int m= b.length; 
        int n= b[0].length; 
        visited = new boolean[m][n];


        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (backtrack(b, w, 0, directions, r, c))
                    return true; 
            }
        }
        return false; 
    }

    int[][] directions= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};

    private boolean backtrack(char[][]b, String w, int index, int[][] directions, int r, int c){
        int m= b.length; 
        int n= b[0].length;

        //base condition
        if(index==w.length())
            return true; 

        if(r>=m || c>=n || r<0 || c<0 || b[r][c]!=w.charAt(index) || visited[r][c] ) 
                return false ; 

        visited[r][c]=true; 
        

        for(int[] d: directions){
            int newrow= d[0]+r; 
            int newcol= d[1]+c; 

            if (backtrack(b, w, index + 1, directions, newrow, newcol)) 
                return true;
        }

         visited[r][c] = false; // Backtrack: unmark the cell
        return false;
        
    }
}







  // find the first letter of the word ( say A )
        // check all 4 directions from A 
        // if the next letter of the word, ie (B) is found, go to that 
        // repeat same for B 
        // if the next letter is not found, backtrack 
