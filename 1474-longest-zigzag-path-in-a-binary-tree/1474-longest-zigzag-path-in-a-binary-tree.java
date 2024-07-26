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

    int maxpath = 0;

    public int longestZigZag(TreeNode root) {

        solve(root, 0, true);
        solve(root, 0, false);

        return maxpath;

    }
    // third argumnet in this function --- boolean goLeft is the message we are
    // passing to the node ki currently left lia fir zig zag banane ke liye goRight.
    // [ since its boolean, true means goLeft false means go right]

    private void solve(TreeNode node, int steps, boolean goLeft) {


        if (node == null)
            return;

        maxpath = Math.max(maxpath, steps);


        if (goLeft == true) {
            solve(node.left, steps+1, false); // this goRight is the next step after current left
            solve(node.right, 1, true);
        } else {// else means abhi rught jaana hai

            solve(node.right, steps+1, true);
            solve(node.left, 1, false); 
            // agar right nahi gaya means left jaayega, ab left mein jaaega toh zig zag nahi bana isliye shuru se start kia. so steps=1 .

        }


    }
}