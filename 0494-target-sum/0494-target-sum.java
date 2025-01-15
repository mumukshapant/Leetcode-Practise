class Solution {
    public int findTargetSumWays(int[] nums, int t) {
        // sum, number of ways
        Map<Integer, Integer> dp = new HashMap<>(); 
        
       dp.put(0,1); // dp[0] = 1 

       for(int n:nums){
        Map<Integer, Integer> nextdp = new HashMap<>(); 

            for(int sum:dp.keySet()){

                int no_of_ways =dp.get(sum); 

                //add current number to the sum
                nextdp.put(sum + n , nextdp.getOrDefault(sum +n , 0)+ no_of_ways );

                //subtract current number from the sum
                nextdp.put(sum - n , nextdp.getOrDefault(sum - n , 0)+ no_of_ways );

            }

            dp=nextdp; 


       }

       return dp.getOrDefault(t , 0 ) ; 
        
    }
}