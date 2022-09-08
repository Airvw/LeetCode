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
    private List<Integer> ans = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        
        
        return ans;
    }
    
    private void inorder(TreeNode node){
        if(node == null) return;
        
        
        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
}