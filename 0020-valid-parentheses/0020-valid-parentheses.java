class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>(); 
        if(s.length()==1)
        return false; 

        for(char i=0; i<s.length(); i++){
            char ch = s.charAt(i) ; // (

                if(ch=='(' || ch=='[' || ch=='{')
                    st.push(ch); 

                if(ch==')' || ch==']' || ch=='}')
                {
                    char top= st.pop(); 

                    if (   (top=='(' && ch!=')') || 
                    (top=='[' && ch!=']')  || (top=='{' && ch!='}') )
                    return false; 



                }
            

        }

        return st.isEmpty(); 
        
    }
}