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

    public int ans = 0;

    public int goodNodes(TreeNode root) {
        if(root == null) return ans;
        isGoodNode(root, -10000);

        return ans;
    }

    private void isGoodNode(TreeNode node, int maxVal) {
        if(node == null) return;

        if(node.val >= maxVal){
            maxVal = node.val;
            ans++;
        }
        isGoodNode(node.left, maxVal);
        isGoodNode(node.right, maxVal);
    }
}
