class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>(); 
        for(int i=0;i<s.length();i++){   
            char c= s.charAt(i); //  )
            if(st.isEmpty() &&( c==')' || c==']' || c=='}'))
                return false; 

            if(c=='(' || c=='[' || c=='{')
                st.push(c); 
            if(!st.isEmpty() && (c==']' || c==')' || c=='}')){
                char top = st.pop(); 
                if(top=='(' && c!=')')
                    return false; 
                if(top=='[' && c!=']')
                    return false; 

                if(top=='{' && c!='}')
                return false; 
            }
        }
        return st.isEmpty(); 
    }
}