class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curr= new ArrayList<>(); 
         Set<List<Integer>> res = new HashSet<>(); 
         Arrays.sort(nums);
         backtrack(nums, 0, curr, res);

         return new ArrayList<>(res);
    }
    private List<List<Integer>> backtrack(int[] nums, int index, List<Integer> curr, Set<List<Integer>> res){

        res.add(new ArrayList<>(curr));
        for(int i=index; i<nums.length; i++){

            curr.add(nums[i]); 
            backtrack(nums, i+1, curr, res); 
            curr.remove(curr.size()-1); 
        }

        return  new ArrayList<>(res);
    }

}