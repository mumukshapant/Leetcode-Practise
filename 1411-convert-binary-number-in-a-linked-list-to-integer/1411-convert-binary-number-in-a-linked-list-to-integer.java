public class Solution {
   
    public int getDecimalValue(ListNode head) {
        int decimalValue = 0;
        ListNode curr = head;
        
        while (curr != null) {
            decimalValue = (decimalValue << 1) | curr.val;
            curr = curr.next;
        }

        return decimalValue;
    } 
    
    private String decToBinary(int x) {
        if (x == 0) 
            return "0";
        
        StringBuilder bs = new StringBuilder();
        
        while (x > 0) {
            int rem = x % 2;
            bs.append(rem);
            x = x / 2;
        }
        
        return bs.reverse().toString(); 
    }


}
