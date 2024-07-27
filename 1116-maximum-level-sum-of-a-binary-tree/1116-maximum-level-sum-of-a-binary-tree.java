/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     List<Integer> res = new ArrayList<>(); 

   
    public int maxLevelSum(TreeNode root) {
        
        dfs(root, 0, res); 
        int ans=0; 

        
        int maxsum= Integer.MIN_VALUE; 
        for(int i=0;i<res.size();i++){
            if(res.get(i)>maxsum)
                {maxsum=res.get(i); 
                ans= i+1; }
        }
        return ans; 
        
    }

    public void dfs(TreeNode root, int level,  List<Integer> res){
        if(root==null)
        return; 

        if(res.size()==level)
            res.add(root.val); 

        else
            res.set(level, res.get(level)+root.val); 

        dfs(root.left, level+1, res); 
        dfs(root.right, level+1, res); 

    }
}