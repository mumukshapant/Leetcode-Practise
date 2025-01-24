class Solution {
    public int getSum(int a, int b) {

        if (b == 0)
            return a;

        int sum = a ^ b; // xor
        int carry = (a & b) << 1;

        return getSum(sum, carry); 
    }
}