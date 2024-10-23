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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        return null; 
        if(head.next==null)
        return head; 

        ListNode oddP= head; 
        ListNode oddhead= head; 

        ListNode evenP=head.next; 
        ListNode evenhead= head.next;
        
        while(oddP!=null && evenP!=null && oddP.next.next!=null){
            //ListNode oddlist= new ListNode(oddP); 
            oddP.next=oddP.next.next;
            oddP=oddP.next; 

            evenP.next= evenP.next.next; 
            evenP=evenP.next; 


        }
        oddP.next=evenhead; 
        return oddhead; 


    }
}