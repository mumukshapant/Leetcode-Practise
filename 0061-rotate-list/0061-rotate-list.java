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
        
        //calculate length of list. if k > n , do k mod
        int len=1; 
        ListNode curr= head;

        while(curr.next!=null)
        {
            curr=curr.next; 
            len++; 
        }

        //create a cycle.. 
        curr.next= head; 

        if(k>len)
            k=k%len; 

        for(int i=0;i<len-k;i++) // loop will run 3 times
            curr=curr.next; 

        ListNode temp= curr.next; 

        curr.next=null; 
        

      return temp;


        
    }
}