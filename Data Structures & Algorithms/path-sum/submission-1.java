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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if (root == null) {
            return false;
        }
        int newSum = targetSum - root.val;

        // Check that we're at a leaf node
        if (root.left == null && root.right == null) {
            if (newSum == 0) {
                return true;
            }
            return false;
        }
        if (hasPathSum(root.left, newSum)) {
            return true;
        }

        if (hasPathSum(root.right, newSum)) {
            return true;
        }
        return false;

    }
}