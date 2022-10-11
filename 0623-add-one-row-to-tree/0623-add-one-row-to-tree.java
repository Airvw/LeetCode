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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        findDepth(root, val, depth, 1);

        return root;
    }

    private void findDepth(TreeNode node, int val, int depth, int level) {
        if(node == null) return;
        if(level == depth - 1){
            TreeNode tmp = node.left;
            node.left = new TreeNode(val);
            node.left.left = tmp;
            tmp = node.right;
            node.right = new TreeNode(val);
            node.right.right = tmp;
        }
        else {
            findDepth(node.left, val, depth, level + 1);
            findDepth(node.right, val, depth, level + 1);
        }
    }
}