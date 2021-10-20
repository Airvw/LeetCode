# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.inorder(root, res)
        return res
    
    def inorder(self, root, res):
        if root:
            if root.left:
                self.inorder(root.left, res)
            res.append(root.val)
            if root.right:
                self.inorder(root.right, res)