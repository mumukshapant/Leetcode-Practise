class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a,b)->Integer.compare(a[0],b[0] )); 
        int[] curr= nums[0]; // curr= [1,3]

        List<int[]> l= new ArrayList<>(); 
        
        // /[1,6],[2,3]
        for(int i=1;i<nums.length;i++){
            if(curr[1] >= nums[i][0] ){
                curr[1]= Math.max(curr[1], nums[i][1]); //max interval will b the ending interval
               // l.add(curr[1]); 
            }
            else
                {
                l.add(curr); 
                curr=nums[i]; 
                }

        }
        l.add(curr); 


        
     return l.toArray(new int[l.size()][]);

    }
}