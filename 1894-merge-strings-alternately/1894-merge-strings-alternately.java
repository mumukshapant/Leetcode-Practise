class Solution {
    public String mergeAlternately(String w1, String w2) {
        
        int m= w1.length(); 
        int n= w2.length(); 
        int i=0,j=0; 
        StringBuilder sb= new StringBuilder(); 
        while(i<m && j<n ){

            sb.append(w1.charAt(i)); 
            sb.append(w2.charAt(j));
            i++; j++;

        }

        // if remaining 
        while(i<m)
       {     sb.append(w1.charAt(i)); 
            i++;}
   while(j<n)
       {     sb.append(w2.charAt(j)); 
            j++;}
        return sb.toString(); 
        
    }
}