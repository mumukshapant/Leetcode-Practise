class Solution {
    public void rotate(int[][] matrix) {

        int m= matrix.length; 
        int n= matrix[0].length; 

//transpose 
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp= matrix[i][j]; 
                matrix[i][j]=matrix[j][i]; 
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){

            int start=0, end= m-1; 
            while (start<end){
                  int temp= matrix[i][start]; 
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;

                start++; 
                end--; 
            }

              


       
        }
  
    }
}