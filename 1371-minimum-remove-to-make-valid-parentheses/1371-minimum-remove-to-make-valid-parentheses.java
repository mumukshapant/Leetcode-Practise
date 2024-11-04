class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> st= new Stack<>(); 
        Stack<Integer> badindex= new Stack<>(); 


        //Stack<Character> index= new stack<>(); 



        StringBuilder sb = new StringBuilder(s); 

        for(int i=0;i<s.length();i++){

            char c= s.charAt(i); 

            if(c=='(')
                st.push(i); //index of the bracket 

            else if(c==')'){
                if(st.isEmpty() || s.charAt(st.peek())==')' )
                    st.push(i); // index of closing bracket 

                else   
                    st.pop(); 
            }
            
            else
                continue; 
        
        }


 while(!st.isEmpty()){
            int a = st.pop();
            sb.delete(a,a+1);
        }

        return sb.toString() ;

        
    }
}