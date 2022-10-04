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
        if(root == null) return false;
        if(recur(root, targetSum))
            return true;
        return false;
    }

    private boolean recur(TreeNode root, int targetSum) {
        if(root.left == null && root.right == null) return (targetSum - root.val) == 0;
        if(root.left == null)
            return recur(root.right, targetSum - root.val);
        if(root.right == null) {
            return recur(root.left, targetSum - root.val);
        }
        return recur(root.left, targetSum - root.val) || recur(root.right, targetSum - root.val);
    }
}