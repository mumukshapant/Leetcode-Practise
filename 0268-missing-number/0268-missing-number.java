class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int xor=0; 

        //first xor all elements from 0 to n 
        for(int i=0;i<=n;i++)
            xor=xor^i; 

        //then xor this result with the nums[i] elements
        for(int i=0;i<n;i++)
            xor=xor^nums[i]; 

        return xor; 
    }
}