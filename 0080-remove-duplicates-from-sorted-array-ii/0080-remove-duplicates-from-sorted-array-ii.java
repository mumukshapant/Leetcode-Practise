class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int second = 1;
        
        for(int i=2;i<nums.length; i++){
            if(nums[i]!= nums[first] ){
                first = second;
                second+=1;
                nums[second] = nums[i];
            }
        }
return second+1;
        
    }
}