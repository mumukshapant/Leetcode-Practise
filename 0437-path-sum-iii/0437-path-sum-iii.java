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

    

    int total=0; 
    public int pathSum(TreeNode root, int targetsum) {

        if(root==null)
            return 0; 

        findpath(root, targetsum, 0 ) ;
        pathSum(root.left, targetsum);
        pathSum(root.right, targetsum); 

        return total; 
        
    }
    private void findpath(TreeNode node, int sum, long currsum){
        if(node==null)
            return ; 

        currsum+=node.val ; 
        
        if(currsum==sum)
            total++; 
        
        findpath(node.left, sum, currsum);
        findpath(node.right, sum, currsum); 
    }
}