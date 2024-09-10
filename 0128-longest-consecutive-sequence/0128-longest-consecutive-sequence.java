class Solution {
    public int longestConsecutive(int[] nums) {
        
        //Time complexity : O(n * logn ) 
        if(nums.length==0)
        return 0; 

        int count=1; 
        int max=1; 
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            
            //duplicates
            if(nums[i]==nums[i-1])
            continue;

            if(nums[i]==nums[i-1]+1){
                count++; 
            }else{
               
                max=Math.max(max, count);
                 count=1; 
            }

        }

        return Math.max(max, count);
    }
}