class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int newcolor) {
         int m= img.length; 
        int n= img[0].length;
        int oldcolor= img[sr][sc]; 
        
        if(oldcolor!=newcolor)
            dfs(img, sr, sc, oldcolor, newcolor);

        return img; 
    }
    private int[][] directions= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    
    private void dfs(int[][] img, int r, int c, int oldcolor, int newcolor){
        int m= img.length; 
        int n= img[0].length;
        
        if(r>=m || c>=n || r<0 || c<0 || img[r][c]!=oldcolor )
            return ; 
        
            img[r][c]=newcolor; 


        for(int[] d: directions){
            int newrow= r+d[0]; 
            int newcol= c+d[1]; 
            

            dfs(img, newrow, newcol, oldcolor, newcolor);

        }
    }
}