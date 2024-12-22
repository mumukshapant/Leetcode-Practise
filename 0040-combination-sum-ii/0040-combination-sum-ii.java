class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {

        Arrays.sort(nums);
         Set<List<Integer>> res = new HashSet<>(); 
         backtrack(nums, 0, target, new ArrayList<>(), res);

        return  new ArrayList<>(res);
    } 
    
    private void backtrack(int[] nums, int index, int t, List<Integer> curr, Set<List<Integer>> res){
        
        if(t==0)
        {    
            res.add(new ArrayList<>(curr));
            return;
        }
         if (t < 0) {
            return;
        }
      

        for(int i=index; i<nums.length; i++){

// adding this condition is removing our Time Limit Exceeded, why? 
// By skipping duplicates, we reduce the number of branches in the recursion tree.
// This can cut down the total number of recursive calls from exponential to manageable levels.
            if (i > index && nums[i] == nums[i-1]) {
                continue;
            }

            if(nums[i]>t)
                break;

            curr.add(nums[i]);             
            backtrack(nums, i+1, t-nums[i], curr, res); 
            curr.remove(curr.size()-1); 
        }

    }
}