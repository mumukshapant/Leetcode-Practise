class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length(); 
        int i=0, j=0,len=1,maxlen=1; 
        if(n==0)
        return 0; 

        Set<Character> set= new HashSet<>(); 

        while(j<n){
           
            if(!set.contains(s.charAt(j)) ){
                set.add(s.charAt(j)); 
                maxlen= Math.max(maxlen, j-i); 
                j++; 

            }else{
                set.remove(s.charAt(i)); 
                i++; 
            }
            maxlen= Math.max(maxlen, j-i); 

            
        }

        return maxlen; 
        
    }
}