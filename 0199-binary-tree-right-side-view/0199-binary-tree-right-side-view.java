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
    //ref: https://www.youtube.com/watch?v=KV4mRzTjlAk

    List<Integer> res= new ArrayList<>(); 

    public List<Integer> rightSideView(TreeNode root) {
      
        preorder(root, 0);

        return res; 
    }
    public void preorder(TreeNode node, int level ){
        if(node==null)
            return; 
        
        if(res.size()==level)
            res.add(node.val); 

        preorder(node.right, level+1) ; 
        preorder(node.left, level+1); 

    }
}