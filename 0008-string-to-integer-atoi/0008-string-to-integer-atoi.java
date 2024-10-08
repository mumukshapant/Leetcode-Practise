class Solution {
    public int myAtoi(String s) {
        int i = 0;
        boolean neg = false;
        int res = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // whitespaces
        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        //positive or negative
       if(i<s.length() && (s.charAt(i)=='-'|| s.charAt(i)=='+')){
        if(s.charAt(i)=='-'){
            neg=true;
        }
        i++;
    }

        
        //isdigt? 
        while (i < s.length() && s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0) {
            int digit = s.charAt(i) - '0'; //get the curr digit [ 1 ], 3, 3

            if (res > max / 10 || (res == max / 10 && digit > max % 10)) {
                return neg ? min : max;
            }

            res = (res * 10) + digit; // res= 1, res= 10+3 = 13, res= 130+3 = 133, 
            i++;
        }

        return neg ? -res : res;
    }

}