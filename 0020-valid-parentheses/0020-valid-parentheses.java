import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        

        if (s.length() % 2 != 0) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Push opening bracket
            if (ch == '(' || ch == '[' || ch == '{') 
                st.push(ch);
            
            // Check closing brackets.
            else if (ch == ')' || ch == ']' || ch == '}') {
                // If stack is empty, no corresponding opening bracket.
                if (st.isEmpty()) {
                    return false;
                }
                
                char top = st.pop();
                
               
                if ((top == '(' && ch != ')') || 
                    (top == '[' && ch != ']') || 
                    (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        
       
        return st.isEmpty();
    }
}
