class Solution {
    public boolean rotateString(String s, String t) {
        if(s.length()!=t.length())
            return false; 

        s=s+s; 
        return s.contains(t);
    }
}