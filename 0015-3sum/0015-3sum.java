class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

     //   n[i] + n[j] + n[k] = 0 

        Set<List<Integer>> set= new HashSet<>(); 
        
        int n= nums.length; 
        Arrays.sort(nums); 

        for(int i=0;i<n;i++){
            int sum= 0- nums[i];  
            int k=n-1 , j=i+1 ;

            while(j<k){
            if(sum==nums[j]+nums[k])
            {
                set.add(Arrays.asList(nums[i], nums[j], nums[k])); 
                j++; 
                k--; 
            }
            else if(nums[j]+nums[k] > sum)
                k--; 
            else 
                j++; 

            }

            

        }
        return new ArrayList<>(set); 
        
    }
}