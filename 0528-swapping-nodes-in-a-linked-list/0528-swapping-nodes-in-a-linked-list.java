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
    public ListNode swapNodes(ListNode head, int k) {

        

         ListNode temp=head;
         int n= 0; 
        while(temp!=null)
            {temp=temp.next;
            n ++;  }

            ListNode first=head; 
            ListNode second=head; 

            for(int i= 1;i<k ;i++){
                first= first.next;

            }

            for (int i = 1; i < n - k + 1; i++) {
            second = second.next;
        }

        int tempval= first.val; 
        first.val=second.val; 
        second.val=tempval; 

        return head; 


        
    }
}