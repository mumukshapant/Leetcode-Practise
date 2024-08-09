class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // dummy points to the head
        // handles the case where the head needs to be removed.
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode curr = dummy;
        
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
 
        return dummy.next;
    }
}
