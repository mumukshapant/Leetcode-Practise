import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger b1= new BigInteger(num1); 
        BigInteger b2= new BigInteger(num2); 

        return String.valueOf(b1.add(b2)); 
    }
}