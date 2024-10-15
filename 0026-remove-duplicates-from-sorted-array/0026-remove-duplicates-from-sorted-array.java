class Solution {
    public int removeDuplicates(int[] nums) {
     int j=0; 
     int i=1;
     while(i<nums.length){
        if(nums[i]==nums[i-1]){
            i++;

        }else{
            nums[j+1]=nums[i];
            i++;
            j++;
        }
     }   
     return j+1;
    }
}