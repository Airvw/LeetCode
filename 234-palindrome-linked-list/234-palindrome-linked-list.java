/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;


            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;

        }
        if(fast != null){
            slow = slow.next;
        }

        while(prev != null && prev.val == slow.val){
            slow = slow.next;
            prev = prev.next;
        }

        return prev == null;
    }
}