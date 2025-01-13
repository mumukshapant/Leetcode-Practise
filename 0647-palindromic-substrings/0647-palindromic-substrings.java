class Solution {
    private int count = 0; // global count variable

    public int countSubstrings(String s) {
        backtrack( s , 0 );
        return count;
    }

    private void backtrack(String s, int index) {
        if (index == s.length()) {
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String substring = s.substring(index, i + 1); 

            if (isPalindrome(substring)) 
                count++;
            
        }

        backtrack( s, index + 1);
    }

    private boolean isPalindrome(String s){

        if(s.length()==1)
            return true; 
        
        int left=0, right=s.length()-1; 

        while(left<right){

            if(s.charAt(left)!=s.charAt(right))
                return false; 

            left++; 
            right--; 
        }
        return true; 
    }
}
