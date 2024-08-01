/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();
        if (root != null)
            traverse(root, "", res);

        return res;
    }

    public void traverse(TreeNode root, String pathtillnow, List<String> res) {

        if (root.left == null && root.right == null)
            res.add(pathtillnow+root.val);

        if (root.left != null)
            traverse(root.left, pathtillnow + root.val + "->", res);

        if (root.right != null)
            traverse(root.right, pathtillnow + root.val + "->", res);

    }
}