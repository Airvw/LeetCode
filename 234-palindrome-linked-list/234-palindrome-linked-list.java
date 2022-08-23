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
    private List<Integer> arr = new ArrayList<>();

    public boolean isPalindrome(ListNode head) {
        while(head.next != null){
            arr.add(head.val);
            head = head.next;
        }
        arr.add(head.val);
        int j = arr.size() - 1;
        for(int i = 0; i < arr.size() / 2 ; i++){
            if(arr.get(i) != arr.get(j)) return false;
            j--;
        }

        return true;
    }
}