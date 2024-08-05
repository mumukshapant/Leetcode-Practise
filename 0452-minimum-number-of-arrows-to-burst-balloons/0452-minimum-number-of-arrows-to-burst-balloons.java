class Solution {
    public int findMinArrowShots(int[][] nums) {
        
        Arrays.sort(nums, (a,b)->Integer.compare(a[1], b[1]));
        int count=1; 
        
        int[] curr= nums[0]; //1,6

        for(int i=1; i<nums.length;i++){
            if(curr[1]<nums[i][0]){
                count++; 
                curr=nums[i]; 
            }

        }


        return count; 
    }
}