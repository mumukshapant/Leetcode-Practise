class Solution {
    public int findMin(int[] nums) {
        int min= Integer.MAX_VALUE ;
        //brute
        for(int i=0;i<nums.length;i++){
           // for(int j=0;j<nums.length;j++){
                min=Math.min(nums[i], min); 
            //}
        }return min; 
    }
}