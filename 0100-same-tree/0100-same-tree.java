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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null)  
        return true; 

        if((p==null && q!=null) || (p!=null && q==null))
        return false; 

        List<Integer> res1 = bfs(p);
        List<Integer> res2 = bfs(q);

        return res1.equals(res2);

    }

    private List<Integer> bfs(TreeNode node) {
        if (node == null)
        {
            return new ArrayList<>(); 
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            // to handle structural difference
            if (curr == null) {
                res.add(null); 
                continue;
            }
            res.add(curr.val);

           // if (curr.left != null)
                q.offer(curr.left);

           // if (curr.right != null)
                q.offer(curr.right);

        }
        return res;
    }
}