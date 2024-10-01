class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false; 

        Map<Character, Character> map= new HashMap<>(); 
        for(int i=0;i<s.length(); i++){

            char og= s.charAt(i); 
            char rep = t.charAt(i); 


            if(!map.containsKey(og)){
                if(!map.containsValue(rep))
                    map.put(og, rep); 
                else    return false; 
            }
            else {// means there is already a mapping between og and rep [ g -> d ] in eg[g] and ad[d]
            char ch = map.get(og); // og : [g] , map.get(og) gives [d]
            if (ch!=rep)
                return false;  
                
            }
        }
        return true; 



        
    }
}