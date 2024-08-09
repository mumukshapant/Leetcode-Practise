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
    public ListNode getIntersectionNode(ListNode ha, ListNode hb) {

        if(ha==null)
            return hb; 

        if(hb==null)
            return ha; 

        //length of ha and hb; 
        int l1=0; 
        int  l2=0; 
        ListNode curra= ha; 
        ListNode currb= hb; 

        while(curra.next!=null){
            l1++; 
            curra=curra.next; 
        }

          while(currb.next!=null){
            l2++; 
            currb=currb.next; 
        }
        System.out.print(l1+" "+l2); 

       if(l1>l2){
        while(l1!=l2){
            ha=ha.next; 
            l1--; 
        }
       }

       if(l1<l2){
        while(l1!=l2){
            hb=hb.next; 
            l2--; 
        }
       }

       ListNode t1=ha;
    ListNode t2=hb;

       while(t1!=null && t2!=null){
        if(t1==t2)
            return t1; 
        else {
            t1=t1.next; 
            t2= t2.next; 
        }
       }
       

       return null; 
        
    }
}