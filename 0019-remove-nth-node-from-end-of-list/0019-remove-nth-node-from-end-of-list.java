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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null; 

        
        //len of list 

        int len=0; 
        ListNode curr=head; 
        while(curr!=null){
        curr=curr.next; 
        len++; 
        }

        int k=len-n; 
        
        int i=1; 

        curr=head; 
        if(k==0)
            return head.next;

        while(i!=k){
            curr=curr.next; 
            i++; 
        }

        if(curr.next!=null)
            curr.next=curr.next.next; 

        

    return head; 
        
    }
}