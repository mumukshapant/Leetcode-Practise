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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
        return true; 

        List<Integer> t1= new ArrayList<>(); 
        List<Integer> t2= new ArrayList<>(); 

        dfs(root1, t1); 
        dfs(root2,t2); 

        return t1.equals(t2); 

      


    }

    private void dfs(TreeNode node, List<Integer> leaves){
        if(node!=null){
            if(node.left==null && node.right==null)
                leaves.add(node.val); 

            dfs(node.left, leaves); 
            dfs(node.right, leaves);
        }
    }
}