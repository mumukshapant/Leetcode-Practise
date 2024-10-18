class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1; 
        int j=0;

        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                nums[j+1]=nums[i]; 
                i++;
                j++; 
            }else{
                i++; 
          
            }
        }
        return j+1; 
    }
}