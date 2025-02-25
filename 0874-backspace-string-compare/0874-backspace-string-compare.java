class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss =new Stack<>(); 
        Stack<Character> tt =new Stack<>(); 

        int n= s.length(); 

         for(int i=0;i<s.length(); i++){
            char c= s.charAt(i);
            if(c!='#')
                ss.push(c); 
            
            if(s.charAt(i)=='#' && !ss.isEmpty())
                ss.pop(); 
        }


        for(int i=0;i<t.length(); i++){
            char c= t.charAt(i);
            if(c!='#')
                tt.push(c); 
            
            if(t.charAt(i)=='#' && !tt.isEmpty())
                tt.pop(); 
        }
        return ss.equals(tt); 
    }
}