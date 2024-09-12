class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>(); 

        Arrays.sort(nums); 
        
        for(int i=0;i<nums.length;i++){
            int j= i+1; 
            int k= nums.length-1; 
            int rem= 0-nums[i]; // rem = nums[j]+nums[k] 
            while(j<k){
                if(nums[j]+nums[k]==rem)
                {
                    res.add(Arrays.asList(nums[i],nums[j], nums[k]));
                    j++; 
                    k--;
                }else if (nums[j]+nums[k]>rem)
                    k--;
                else j++; 

            }
        }
        List<List<Integer>> finalres= new ArrayList<>(res); 



        return finalres; 
    }
}