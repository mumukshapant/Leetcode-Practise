class Solution {
    public String minWindow(String s, String t) {
        
        // create a hashmap for t 

int[] freq= new int[128];  // all lower and upper case characters, plus numbers , plus sp chars
int sindex=-1; 
     int i=0, j=0; 
         int minlen= Integer.MAX_VALUE; 
         int count=0; 


         for(int k=0;k<t.length();k++){
            freq[t.charAt(k)]++; 
         }

         // now for every element in s, we decremenet the frequency in t . 
         // everytime the char in s is matching to t , we increment the varibale "count"
         // when count==length of t, 

    
         while(j<s.length())
         {
            char ch= s.charAt(j);
            if(freq[ch]>0) //means curr character at s already occucrs in t 
                count++; 
            
            
            freq[ch]--;    //reduce the frequency 

            
             while(count==t.length())
             {   
                if(j-i+1 <minlen){
                    minlen=j-i+1; 
                    sindex=i; 
                }

                freq[s.charAt(i)]++; 
                
                if(freq[s.charAt(i)]>0)
                    count--; 
                
                i++;
             }
             j++; 
         }
    //     return s.substring(sindex,sindex+minlen); 
        return minlen == Integer.MAX_VALUE ? "" : s.substring(sindex, sindex + minlen);

    }
}