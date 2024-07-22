class Solution {
    public String reverseWords(String s) {
        int j=0; 
        String temp=""; 
        String res = "";
        int n= s.length(); 
        int i=0;


        while(i<n){
            while(i<n && s.charAt(i)==' ')
                {i++; }
            
            if(i>=n)
                break;
            j=i+1; 
            while(j<n && s.charAt(j)!=' ')
                j++; 

            temp=s.substring(i, j); 

            if (res.isEmpty()) {
                res = temp;
            } else {
                res = temp + " " + res;
            }


           


             i=j+1;



        }
        return res; 
    }
}