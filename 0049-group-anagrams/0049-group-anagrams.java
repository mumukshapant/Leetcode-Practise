class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        int n= str.length; 
        Map<String, List<String>> map = new HashMap<>();


        for(int i=0;i<n; i++){
            String word= str[i]; // eat
            
            char[] ch= word.toCharArray();  //'e' 'a' 't'

            Arrays.sort(ch); //  a e t 

            String sortedword= new String(ch); 
            
            if(!map.containsKey(sortedword))
                map.put(sortedword, new ArrayList<>()); 
            
            map.get(sortedword).add(word); 
        }

        return new ArrayList<>(map.values()); 
        
    }
}