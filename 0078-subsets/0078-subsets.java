class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> curr= new ArrayList<>(); 
        List<List<Integer>> res=new ArrayList<>(); 
        
         helper(nums, 0, curr, res); 
        return res; 
    }
    private void helper(int[] nums, int index, List<Integer> curr, List<List<Integer>> res){

     
        for(int i=index;i<nums.length; i++){
            curr.add(nums[i]); 
            helper(nums, i+1, curr, res); 
            curr.remove(curr.size()-1); 
        }
        res.add(new ArrayList<>(curr));
        return;

        
       
    }
}