import java.math.BigInteger; 

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger b1= new BigInteger(num1); 
        BigInteger b2= new BigInteger(num2); 

        // int x= Integer.parseInt(num1)+Integer.parseInt(num2);
        // String res=Integer.toString(x); 
        return String.valueOf(b1.add(b2));
    }
}