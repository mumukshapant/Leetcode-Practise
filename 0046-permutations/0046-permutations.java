class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res= new ArrayList<>(); //final list of all permutations
        List<Integer> perm= new ArrayList<>(); //list of temporary permutations
        boolean[] used= new boolean[nums.length]; 

        backtrack(res, perm, used, nums);

        return res; 
        
    }

    private void backtrack(List<List<Integer>> res, List<Integer> perm, boolean[] used, int[] nums ){

        if(perm.size()==nums.length){
            res.add(new ArrayList<>(perm)); 
            return ; 
        }

        for(int i=0;i<nums.length;i++){

//currently used is false
            if(!used[i]){
                perm.add(nums[i]); 
                used[i]=true; 

                backtrack(res, perm, used, nums); 

                used[i]=false; 
                perm.remove(perm.size()-1); 
            }
        }



    }
}