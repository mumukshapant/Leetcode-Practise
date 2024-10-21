class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>(); 
        int res = 0;

        for(int i=0; i<s.length();i++){
            char c= s.charAt(i); 
            if(c=='(')
                st.push(c); 
            else if(c==')')
            {
                int size= st.size(); 
                res = Math.max(res,size);
                st.pop();
            }
        }
        return res; 
        
    }
}