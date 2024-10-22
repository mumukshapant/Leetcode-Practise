/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode og = head;
        ListNode rev = reverse(cloneList(head));
        while (og != null && rev != null) {
            if (og.val != rev.val) {
                return false;
            }
            og = og.next;
            rev = rev.next;
        }

        return true;

    }

    private ListNode reverse(ListNode head) {
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

    private ListNode cloneList(ListNode head) {
        if (head == null)
            return null;

        ListNode newHead = new ListNode(head.val);
        ListNode curr = newHead;
        while (head != null) {
            curr.next = new ListNode(head.val);

            head = head.next;
            curr = curr.next;
        }
        return newHead;
    }

}