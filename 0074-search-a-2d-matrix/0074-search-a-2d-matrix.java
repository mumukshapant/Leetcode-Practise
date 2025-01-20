class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        
        int m= mat.length; 
        int n= mat[0].length;

        for(int nums[] : mat){
            if(binarysearch(nums, t)!=-1)
                return true;  
            
        }
        return false; 
    }
    private int binarysearch(int[] mat, int t){

        int low=0, high=mat.length-1; 
        while(low<=high){
            int mid= low+(high-low)/2; 

            if(mat[mid]==t)
                {
                
                    return mid;} 

            else if (t>mat[mid])
                low=mid+1; 
            else high=mid-1; 
        }
        return -1; 

    }
}