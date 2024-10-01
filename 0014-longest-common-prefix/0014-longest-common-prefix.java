class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);  // flight , flow, flower
        StringBuilder sb= new StringBuilder(); 

        int n= strs.length; 

        String s1= strs[0];  //flight
        String s2= strs[n-1]; //flower
        int i=0,j=0; 

        while(i!=s1.length() && j!=s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                sb.append(s1.charAt(i)); 
                i++; 
                j++; 
            }else {
                break; 
            }

        }
        return sb.toString(); 

        
    }
}