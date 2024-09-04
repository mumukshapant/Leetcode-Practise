class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        //k doesn't exceed the length of the array. 
        k = k % nums.length; 
        reverse(nums, 0,n); 
        reverse(nums, 0,k-1); 
        reverse(nums, k,n); 

    }

  
      private void reverse(int[] arr, int start, int end){
        
        while(start<end){
            int temp= arr[start]; 
            arr[start]= arr[end]; 
            arr[end]= temp; 
            start++; 
            end--  ;
        }}
}