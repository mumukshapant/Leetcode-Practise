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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // nodes a to b remove karna hai . 
        // 0 indexing 

        ListNode curr=list1; 
        ListNode ptr= list1; 
        ListNode p2= list2; 

        int start= 0; 
        int end=0; 

        //count till a
        while(start+1!=a){
           start++; 
            curr=curr.next; 
        }

        //count from end ( use b )
        while(end-1!=b){
            ptr=ptr.next; 
            end++; 

        }

        while(p2.next!=null){
            p2=p2.next; 

        }

        curr.next=list2; 
        p2.next=ptr; 

    

        return list1;
        
    }
}