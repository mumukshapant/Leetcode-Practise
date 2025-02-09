class Solution {
    public int trap(int[] nums) {

        int n= nums.length; 

        int[] left= new int[n]; 
        int[] right= new int[n]; 
        int res=0; 

        left[0]=nums[0]; 
        right[n-1]=nums[n-1]; 


        for(int i=1; i<n; i++){
            left[i] = Math.max(nums[i], left[i-1]); 
        }

        for(int i=n-2; i>=0;i--){
            right[i]= Math.max(nums[i], right[i+1]); 
        }

        for(int i=0;i<n;i++){
            res += Math.min(left[i], right[i]) - nums[i] ; 
        }

        return res; 
        
    }
}