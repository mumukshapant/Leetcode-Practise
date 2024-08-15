class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null)
            return head; 

        if(k==0)
            return head; 

        //create a cycle in linked list then break that cycle at k; 

        //calculate length ;
        int len= 1; 
        ListNode temp= head; 
        while(temp.next!=null){
            temp=temp.next; 
            len++; 
        }
     

        temp.next=head; 
        k = k % len; // because value of k can be greater 
 

        // (len - k) steps from the start
        for (int i = 0; i < len - k; i++) {
            temp = temp.next;
        }
        head=temp.next; 
        temp.next=null; 

        return head; 


        
    }
}