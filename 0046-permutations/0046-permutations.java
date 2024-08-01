class Solution {

    //ref : https://www.youtube.com/watch?v=H232aocj7bQ
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; 


        List<Integer> permutation = new ArrayList<>();

        backtrack(res, permutation, nums, used);
        
        return res;

    }

    public void backtrack(List<List<Integer>> res, List<Integer> perm, int[] nums, boolean[] used) {

        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // letter has not been used yet
            if (used[i] == false) {

                perm.add(nums[i]);
                used[i] = true;
                backtrack(res, perm, nums, used);

                used[i] = false;
                perm.remove(perm.size() - 1);

            }

        }

    }
}