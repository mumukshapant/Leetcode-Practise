class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>(); 
        if(s.length()%2!=0)
        return false; 

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i); 
            if(c=='(' || c=='{' || c=='[')
                st.push(c); 

             if((c==')' || c==']' || c=='}')){
                if (st.isEmpty()) {
                    return false;
                }


                int top= st.pop(); 
                if((c==')' && top!='(') || (c==']' && top!='[') || (c=='}' && top!='{'))
                    return false; 
            }

         

        }
        return st.isEmpty(); 
        
    }
}