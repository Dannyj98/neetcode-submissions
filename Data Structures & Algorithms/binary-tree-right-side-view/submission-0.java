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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if (root != null) queue.offer(root);

        while(!queue.isEmpty()) {
            int queueSize = queue.size();
            TreeNode lastItem = null;
            for (int i = 0; i < queueSize; i++) {
                TreeNode curr = queue.poll();
                
                if (curr.right != null) queue.offer(curr.right);
                if (curr.left != null) queue.offer(curr.left);

                if (i == 0) {
                    lastItem = curr;
                }
            }
            res.add(lastItem.val);
        }

        return res;
    }
}
