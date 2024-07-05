class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0; 
        int n=nums.length; 
        Set<List<Integer>> set= new HashSet<>(); 

        //brute
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                if(Math.abs(nums[j]-nums[i])==k)
                    {
                        //set.add(Arrays.asList(nums[i], nums[j])); 
                        List<Integer> pair = Arrays.asList(Math.min(nums[i], nums[j]), Math.max(nums[i], nums[j]));
                    set.add(pair);
                    }
            }
        }

        return set.size(); 
        
    }
}