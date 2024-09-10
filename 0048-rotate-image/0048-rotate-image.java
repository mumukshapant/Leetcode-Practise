class Solution {
    public void rotate(int[][] mat) {
        int row= mat.length; 
        int col= mat[0].length; 

        for(int i=0;i<row;i++){
            for (int j=0;j<=i;j++){
               int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //reverse by row 
       
        for(int i=0;i<row; i++){

             int start=0; 
         
        int end= row-1; 
            while(start<end){
                int temp= mat[i][start] ; 
                mat[i][start]=mat[i][end] ; 
                mat[i][end] =temp;

                start++; 
                end--;

            }
        }

        
    }
    // public void transpose(int[][] mat){
        
    // }

}