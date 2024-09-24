class Solution {
    public String longestCommonPrefix(String[] s) {

        Arrays.sort(s); //flight , flow, flower

        int i=0; 
        int n= s.length; 

        String s1= s[0];   //f l i g h t
        String s2= s[n-1];// f l o w e r 

        while(i<s1.length() && i<s2.length() ){
            if(s1.charAt(i)==s2.charAt(i))
                 i++; 

            else 
                break ; 
        }
        return s1.substring(0,i); 



    }
}