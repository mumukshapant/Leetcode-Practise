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
    public List<Double> averageOfLevels(TreeNode root) {

     List<Double> res= bfs(root); 
     return res; 

    }

    private List<Double>  bfs(TreeNode node){
        if(node==null)
            return null; 

        Queue<TreeNode> q= new LinkedList<>(); 
        // everytime a level ends, append a "null" in the q

        q.offer(node); 
        q.offer(null);
        List<Double> res = new ArrayList<>(); 


        while(q.peek()!=null){
            int count=0; 
            double sum=0.0; 


            while(q.peek()!=null){
                TreeNode curr= q.poll(); 
                sum+=curr.val; 
                count++;
                if(curr.left!=null)
                    q.offer(curr.left); 

                if(curr.right!=null)
                    q.offer(curr.right);

            }

            q.add(q.poll());
            res.add(sum/count);
        }



        return res; 
    }
}