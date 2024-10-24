/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0,len2=0; 
        ListNode curr1=headA , curr2=headB; 
        while(curr1!=null){
            curr1=curr1.next; len1++; 
        }while(curr2!=null){
            curr2=curr2.next; len2++; 
        }

        curr1=headA; 
        curr2= headB; 

        if(len1>len2){
            int diff=len1-len2; 
            while(diff!=0){
                curr1=curr1.next; 
                diff--; 
            }
        }else{
                        int diff=len2-len1; 

            while(diff!=0){
                curr2=curr2.next; 
                diff--; 

            }
        }


// Move both pointers forward until they meet
        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2) {
                return curr1; // Intersection found
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return null;
    }
}