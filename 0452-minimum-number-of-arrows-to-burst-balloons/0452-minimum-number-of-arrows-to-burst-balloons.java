class Solution {
    public int findMinArrowShots(int[][] nums) {
        int count=1; 
        Arrays.sort(nums, (a,b) -> Integer.compare(a[1], b[1])) ; 
        //becomes [1,6] , [2,8] , [7,12] , [10,16]
        int j=0;  //prev

        for(int i=1;i<nums.length; i++){
      
                if(nums[j][1]<nums[i][0]) // merge intervals
                {
                    count++; 
                    j=i; 

                }
            
        }
        return count; 
    }
}