class Solution {
    public int trap(int[] nums) {
        int n = nums.length; 
        int res=0; 

        // int[] left= new int[n]; 
        // left[0]=nums[0]; 
        // int[] right= new int[n]; 
        // right[n-1]=nums[n-1]; 

        // for(int i=1;i<n; i++){
        //     left[i]=Math.max(nums[i], left[i-1]); 
        // }
        // for(int i=n-2; i>=0;i--){
        //     right[i]=Math.max(nums[i], right[i+1]); 
        // }
        int left= Integer.MIN_VALUE; 
        int right =  Integer.MIN_VALUE; 
        int i=0, j=nums.length-1; 

        while(i<j){
            left=Math.max(nums[i], left); 
            right= Math.max(nums[j], right); 

            if(left<right){
                res+=left-nums[i]; 
                i++;
            }else{
                res+=right- nums[j]; 
                j--;
            }
        }
        //we are doing ( -nums[i] OR -nums[j]) because we need to calculate kitna water store ho raha hai not the entire area which is being covered. 

        return res; 
    }
}