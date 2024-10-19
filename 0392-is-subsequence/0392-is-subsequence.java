class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0,count=0; 
        if(t.length()<s.length()) return false; 
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j))
            {   count++; 
                i++; j++; 
            }else{i++; }
        }
        return count==s.length(); 
    }
}