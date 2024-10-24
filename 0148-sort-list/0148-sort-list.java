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
    public ListNode sortList(ListNode head) {
        //brute 
    /**
    1. copy all list el to arr 
    2. sort arr
    3. put them back in list
     */
     ListNode curr=head; 
        List<Integer> arr= new ArrayList<>(); 

     while(curr!=null){
        arr.add(curr.val); 
        curr=curr.next; 
     }
     Collections.sort(arr); 
     curr=head; 
     int i=0; 
     while(curr!=null){
        curr.val=arr.get(i); 
     i++; 
     curr=curr.next; 
     }
     return head; 
    }
}