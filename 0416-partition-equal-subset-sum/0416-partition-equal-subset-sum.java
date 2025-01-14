class Solution {

    Boolean[][] mem; 
    public boolean canPartition(int[] nums) {

        int n= nums.length; 
        int sum=0; 

        for(int i=0;i<n;i++)
            sum+=nums[i]; 

        if(sum%2!=0)
            return false; 

        sum=sum/2;

        mem= new Boolean[n+1][sum+1]; //for repetitive recursive calls . 
        //Time complexity for Recursion is O(2^n) which is ALOTT!!
        // So we store results for each recursion in the mem[][] array.

        //else call recursion 
        return recursion(nums, 0, sum);
    }
    private boolean recursion(int[] nums, int index, int sum){

        if(sum<0)
            return false; //if sum is -ve, means subset is wrong, return it 
        
        if(sum==0)
            return true; 

        if(index==nums.length)
            return false; 

        
        // if(mem[index][sum]) 
        //     return true;

        if(mem[index][sum]!=null) 
            return mem[index][sum];

        
        //recursion has 2 options--chose or not chose
        mem[index][sum]= recursion(nums,index+1 , sum-nums[index]) || recursion(nums,index+1 , sum );
            


        return mem[index][sum];

        

    }
}