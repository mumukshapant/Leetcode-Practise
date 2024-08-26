class Solution {
    public String longestCommonPrefix(String[] s) {
//     int i=0; 
     int j=0; 
     int n= s.length; 
     int len=0; 
     Arrays.sort(s); 
     String s1= s[0];     // s[0]= flight, flow, flower
     String s2= s[n-1] ; 
     int i=0; 




     while(i<s1.length()  && i<s2.length()){
        if(s1.charAt(i)==s2.charAt(i)){
            i++; 
        }
        else break ; 
     }


     return s1.substring(0, i); 
       
    }
}