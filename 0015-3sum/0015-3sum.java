class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length ; 
        Arrays.sort(nums);

        Set<List<Integer>> temp = new HashSet<>(); 
        for(int i=0;i<n;i++){

            int sum= 0-nums[i];
            int j=i+1; 
            int k=n-1; 

            while(j<k){
                int rem= nums[j]+nums[k];
                if(rem==sum){
                temp.add(Arrays.asList(nums[i],nums[j], nums[k]));
                j++ ;
                k--; 
                }else if (rem>sum)
                    k--;
                else
                    j++;
                
            }
        


         //  n[j]+n[k]=0-nums[i]
            

        }
             return new ArrayList<>(temp); 


    }
}