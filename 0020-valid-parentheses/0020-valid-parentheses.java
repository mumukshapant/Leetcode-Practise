class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>(); 
        if(s.length()==1)
            return false; 
        

        for(int i=0;i<s.length();i++){

           
                if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='(' )
                    st.pop(); 

                 else if(!st.isEmpty() && s.charAt(i)==']' && st.peek()=='[' )
                    st.pop(); 

                 else if( !st.isEmpty() && s.charAt(i)=='}' && st.peek()=='{' )
                    st.pop(); 

                else 
                st.push(s.charAt(i));


        

        
}
        return st.isEmpty();
        
    }
}