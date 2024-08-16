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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0)
            return head; 

        if(head==null)
            return head; 

        ListNode temp = head; 
        while(temp.next!=null)
            temp=temp.next; 

        temp.next=head; 

        ListNode curr=head; 

        for(int i=0;i<k;i++){
            curr=curr.next;
        }
        head=curr.next; 
        curr.next=null;

        return head; 
        
    }
}