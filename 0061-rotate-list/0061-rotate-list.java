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
        int len=1;
        while(temp.next!=null)
            {temp=temp.next; 
            len++; }

        temp.next=head; 
         k = k % len; // because value of k can be greater 
 

        ListNode curr=head; 

        for(int i=0;i<len-k;i++){
            temp=temp.next;
        }
        head=temp.next; 
        temp.next=null;

        return head; 
        
    }
}