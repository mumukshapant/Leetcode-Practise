class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length; 
        Map<Integer, Integer> map = new HashMap<>();

        //brute 
        for(int i=0;i<n; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1); 
        }

        for(Map.Entry <Integer, Integer> e : map.entrySet())
            if(e.getValue()==1)
                return e.getKey(); 
        return -1; 
    }
}