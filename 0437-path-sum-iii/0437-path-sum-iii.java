import java.util.HashMap;
import java.util.Map;

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
    private int count = 0;
    private Map<Long, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L, 1);
        
        //note this is 0L
        findPath(root, targetSum, 0L);
        return count;
    }

    private void findPath(TreeNode node, int targetSum, long currSum) {
        if (node == null) {
            return;
        }

        currSum += node.val;

        if (map.containsKey(currSum - targetSum)) {
            count += map.get(currSum - targetSum);
        }

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        findPath(node.left, targetSum, currSum);
        findPath(node.right, targetSum, currSum);

        map.put(currSum, map.get(currSum) - 1); // Remove the current node's value before returning to the caller
    }
}
