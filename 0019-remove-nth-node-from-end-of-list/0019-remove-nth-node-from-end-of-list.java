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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode curr = head; 
        int n=0; //length of the list
        while(curr!=null){
            curr=curr.next; 
            n++; 
        }
        curr=head; 
        
      
        
        if(k==0)
            return head;

        else if(k==n) // head needs to be removed
        {
            head=head.next;
            return head;
        }

       else if(k==1) //. Last element needs to be remobed 
        {
            while (curr.next.next!=null){
                curr=curr.next; 
            }
            curr.next=null;
            return head; 
        }

        else{
            int pos= n-k; //from beginning 
            curr=head; 
            while(pos>1){
                curr=curr.next; 
                pos--; 
            }
            curr.next=curr.next.next; 
           // return head; 
        }

    


   return head;



    }
}