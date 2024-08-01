
class Solution {
    public List<List<Integer>> permute(int[] nums) {


        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // Correctly initialize the used array
        List<Integer> permutation = new ArrayList<>();

        backtrack(res, nums, permutation, used);
        return res;
    }


    void backtrack(List<List<Integer>> res, int[] nums, List<Integer> permutation, boolean[] used) {

        // if goal is reached, add the solution to the result set. & return 
        if (permutation.size() == nums.length) {
            res.add(new ArrayList<>(permutation)); // Clone the permutation list
            return;
        }

        // choices are left. 
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) // valid choice
            { 
                used[i] = true;
                permutation.add(nums[i]); // make a choice
                backtrack(res, nums, permutation, used);  //backtrack 

                // undo choice -- remove the last element 
                used[i] = false;
                permutation.remove(permutation.size() - 1); 
            }
        }
    }

   
}
