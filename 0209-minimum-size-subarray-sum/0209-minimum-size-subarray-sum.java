class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      
        int i=0; int j=0; 
      int sum=0; 
        int minlen=Integer.MAX_VALUE; 
        int len=Integer.MAX_VALUE; 


            while(j<nums.length){
                sum+=nums[j]; 
                j++;
                while(sum>=target){
                   
                    len=j-i; 
                    minlen= Math.min(len, minlen); 
                     sum-=nums[i]; 

                    i++; 
                }
                


            }
        
        return minlen==Integer.MAX_VALUE?0 :minlen; 
    }
}