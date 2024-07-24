class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length; 
        int first=0; 
        int second=1; 


        for(int i=2;i<n; i++){
            if(nums[i]!=nums[first]){
                first=second; 
                second++; 
                nums[second]=nums[i];
            }
        }

        return second+1;
        
    }
}