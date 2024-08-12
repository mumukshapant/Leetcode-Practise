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

        if(head==null)
            return true; 


        //NAIVE WAY 
         ListNode reversedHead = reverse(cloneList(head));

        // Step 2: Compare the original list with the reversed list
        ListNode original = head;
        ListNode reversed = reversedHead;

        while (original != null && reversed != null) {
            if (original.val != reversed.val) {
                return false;
            }
            original = original.next;
            reversed = reversed.next;
        }

        return true;

        




        
    }

   public ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode cn = curr.next; 
        curr.next = prev; 
        prev = curr;
        curr = cn;
    }

    return prev;
}

 public ListNode cloneList(ListNode head) {
        if (head == null) return null;

        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        head = head.next;

        while (head != null) {
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }

        return newHead;

}
}