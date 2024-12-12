class Solution {
    public void rotate(int[][] mat) {
        transpose(mat);

        // now reverse each row 
        for(int i=0;i<mat.length;i++){
        reverserow(mat[i]); 
        }
       
        return ;
        
    }
    private void reverserow(int[] nums){

        int i=0, j=nums.length-1; 
        
        while(i<j){
            int temp= nums[i]; 
            nums[i]=nums[j]; 
            nums[j]=temp; 
            i++; 
            j--; 
        }
    }
    private void transpose (int[][] mat ) 
    {
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}