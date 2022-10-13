/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        while(node.next != null){
            ListNode newNode = node.next;
            node.val = newNode.val;
            if(node.next.next == null){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }
}
