class Solution {
    public int[][] insert(int[][] nums, int[] newinterval) {

        int[] curr = newinterval; 
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0])); 

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

           if(nums[i][1]>= curr[0] && nums[i][0]<=curr[1]){
                //merge 
                curr[0] = Math.min(curr[0], nums[i][0]);
                curr[1] = Math.max(curr[1], nums[i][1]); 
            }
            else if(nums[i][0]> curr[1]){
                // means newinterval is in the front , no merging
                ans.add(curr); 
                curr=nums[i];
            }else{
                ans.add(nums[i]); 
            }
        }
        ans.add(curr);

       
        return ans.toArray(new int[ans.size()][]);
    }
}
