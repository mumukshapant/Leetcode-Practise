class Solution {
    public int subarraySum(int[] nums, int k) {

        // [1,2,1,2,1] k==3 
        Map<Integer, Integer> map = new HashMap<>(); 

        //brute 
        map.put(0,1); 

        int count=0; 
        int sum=0; 
        for(int i=0;i<nums.length; i++){
            sum+=nums[i]; //1 
           
          if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
          }
            //this is wrong : map.put(nums[i],sum);
          
          map.put(sum, map.getOrDefault(sum, 0)+1);
          
        }
        return count;
    }}