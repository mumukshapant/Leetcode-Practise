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
    public ListNode middleNode(ListNode head) {

        int mid=1; 

        //total length 

        int len= 0; 
        ListNode curr=head; 
        while(curr.next!=null){
            curr=curr.next; 
            len++; 

        }

        curr=head; 

        //odd
        if(len%2!=0)
        {
            mid=(len/2)+1; 
            for(int i=0;i<mid; i++)
                curr=curr.next; 
        }

        //even 
else{
    mid= (len/2 ); 
    for(int i=0;i<mid; i++)
                curr=curr.next; 
}
        return curr; 
        
    }
}