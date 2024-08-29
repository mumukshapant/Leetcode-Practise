class Solution {
    public int findMaxLength(int[] nums) {
        // if our map contains a sum and we get that sum again, that means we have reached equal number of 1s and 0s

    Map<Integer, Integer> map = new HashMap<>(); 
    int max = 0 ; 
    int sum=0; 
    

    for(int i=0;i<nums.length; i++){
        
        // if curr el is 1 then +1 , if 0 then -1 
        sum+=nums[i]==1?1:-1; 
        if(sum==0)
            max=i+1; 

        else if(!map.containsKey(sum))
            map.put(sum, i); 
        
        else
            max= Math.max(max, i-map.get(sum)); 
        
       


    }
    return max; 
    }
}