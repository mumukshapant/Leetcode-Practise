class Solution {
    public int characterReplacement(String s, int k) {

        int n= s.length(); 
        int i=0, j=0;
        int maxlen=0, maxfreq=0; 
        Map<Character, Integer> map = new HashMap<>();  
        while(j<n)
        {
            char c=s.charAt(j); 
            map.put(c, map.getOrDefault(c, 0)+1); 

            maxfreq =Math.max(maxfreq, map.get(c)); 

            int window= j-i+1; 
            
            if(window-maxfreq>k){

                char ch= s.charAt(i); 
                map.put(ch, map.getOrDefault(ch, 0)-1); 
                i++; 
            }
            maxlen= Math.max(j-i+1, maxlen); 
            j++; 


        }
        return maxlen; 
    }
}