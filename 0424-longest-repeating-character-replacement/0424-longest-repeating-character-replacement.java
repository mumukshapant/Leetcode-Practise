class Solution {
    public int characterReplacement(String s, int k) {

       // jiski max freq hai, usko touch nahi karna hai 

       int maxlen=0, maxfreq=0;
       int n= s.length(); 
       int i=0, j=0; 
       Map<Character, Integer> map = new HashMap<>();

       while(j<n) {
        char c= s.charAt(j);

        map.put(c, map.getOrDefault(c,0)+1); 

        maxfreq= Math.max(maxfreq, map.get(c)) ; 

        int window= j-i+1; 

        //chars needed to be changed is window- maxfreq 

        if(window- maxfreq > k){

            char character= s.charAt(i); 
            map.put(character,map.get(character)-1); 
            i++; 
        }
        maxlen= Math.max(j-i+1, maxlen); 
        j ++ ;
       }

       return maxlen; 

        

    }
}