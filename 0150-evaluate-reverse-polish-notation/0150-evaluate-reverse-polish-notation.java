class Solution {
    public int evalRPN(String[] s) {
        Stack<String> st= new Stack<>(); 

        String operator= "+-*/"; 

        for(int i=0;i<s.length ;i++){

            //if s[i] is a number : push in stack 
            if(!operator.contains(s[i])){ /// means s[i] is a number

            st.push(s[i]); 

            }else{
                int a= Integer.valueOf(st.pop()); 
                int b = Integer.valueOf(st.pop()); 

                int op= operator.indexOf(s[i]); //operator se s[i] ka index dhundhna // 0 : + 
                // 1: - 
                // 2: *
                //3 : /

                switch(op){
                    case 0: 
                    st.push(String.valueOf((a+b))); 
                    break; 

                    case 1: 
st.push(String.valueOf((b-a))); 
                    break; 


                    case 2: 
                    st.push(String.valueOf((a*b))); 
                    break; 

                    case 3: 
                    st.push(String.valueOf((b/a))); 
                    break; 
                }
            }
        }

        return Integer.valueOf(st.pop()); 
    }
}