# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        
        now, after = head, head.next if head else None
        while after:
            if now.val == after.val:
                after = after.next
                now.next = after
            else:
                now = after
                after = after.next
        return head
        