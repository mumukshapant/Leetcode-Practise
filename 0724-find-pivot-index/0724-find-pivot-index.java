class Solution {
    public int pivotIndex(int[] nums) {

        int leftSum=0; 
        int sum=0; 

        for(int i:nums)
            sum+=i; 

        int rightSum=sum; 

       int i=0; 
       int n= nums.length; 

       while(i<n){
            rightSum-=nums[i]; 


        if(leftSum==rightSum)
            return i; 

        leftSum+=nums[i]; 


        i++; 


       }


        return -1; 
        
    }
}