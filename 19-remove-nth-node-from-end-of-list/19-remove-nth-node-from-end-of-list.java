class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getNodeSize(head);
        int idx = 0;
        ListNode ans;
        if(size == n){
            ans = head.next;
        }else {
            ans = head;
        }
        while(head != null){
            if(idx == size - n - 1){
                head.next = head.next.next;
            }
            head = head.next;
            idx++;
        }
        return ans;
    }

    private int getNodeSize(ListNode head) {
        int result = 0;
        while(head != null){
            head = head.next;
            result++;
        }
        return result;
    }
}