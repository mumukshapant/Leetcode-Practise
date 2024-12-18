class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0; 
        int i=1;
        
        while(i<nums.length){
            if(nums[i-1]!=nums[i]){
                nums[j+1]=nums[i]; 
                i++; 
                j++; 
            }
            else{
                i++; 
            }
        }
        return j+1;
    }
}