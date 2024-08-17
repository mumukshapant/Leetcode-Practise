class Solution {
    public ListNode removeNodes(ListNode head) {
        // Reverse the linked list first
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Traverse the reversed list and keep track of the maximum value seen so far
        ListNode newHead = prev;
        ListNode maxNode = prev;
        curr = prev.next;

        while (curr != null) {
            if (curr.val < maxNode.val) {
                maxNode.next = curr.next; // Remove the node
            } else {
                maxNode = curr; // Update the maxNode
            }
            curr = curr.next;
        }

        // Reverse the list again to restore the original order
        prev = null;
        curr = newHead;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
