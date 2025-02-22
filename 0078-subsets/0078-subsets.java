class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         int n= nums.length;
         List<Integer> curr=  new ArrayList<>(); 
         List<List<Integer>> res =new ArrayList<>(); 
         backtrack(nums, 0, curr, res); 
         return res; 
        
    }
    private void backtrack(int[] nums , int index,List<Integer> curr,  List<List<Integer>> res)
    {

        int n= nums.length; 
        
        //base condition
        if(n==curr.size()){
            res.add(new ArrayList<>(curr)); 
            return; 
        }

        for(int i=index;i<n;i++){
            curr.add(nums[i]); 
            backtrack(nums, i+1, curr, res); 
            curr.remove(curr.size()-1); 
        }
        res.add(new ArrayList<>(curr));

        return; 

    }

}