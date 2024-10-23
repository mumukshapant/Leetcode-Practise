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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
            return null ; 
        if(head.next==null)
            return null; 

        int len=0; 
        ListNode curr= head;
        while(curr!=null){
            curr=curr.next; 
            len++; 
        }
        int mid=len/2; 
        int i=0; 
        curr=head; 
        while(i!=mid-1){
            curr=curr.next; 
        i++; 
        }

        curr.next=curr.next.next;


    return head; 
        
        
    }
}