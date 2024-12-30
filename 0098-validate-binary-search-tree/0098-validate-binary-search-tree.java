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
    public boolean isValidBST(TreeNode root) {
        return findrange(root, Long.MIN_VALUE, Long.MAX_VALUE );
        
    }
    private boolean findrange(TreeNode node , long min, long max){

        if(node==null)  return true; 

        //min is Integer.MIN_VALUE
        //max is Integer.MAX_VALUE

      // if we return true here, then the answer will return true and it will not check the other subtree. 
        if (node.val <= min || node.val >= max) {
            return false; // BST property violated
        }
    

        return (findrange(node.left, min, node.val) && findrange(node.right, node.val, max));

    }
}