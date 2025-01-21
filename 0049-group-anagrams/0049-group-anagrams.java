class Solution {
    public List<List<String>> groupAnagrams(String[] str) {

        int n= str.length; 


    Map<String, List<String>> map = new HashMap<>(); 
        for(int i=0;i<n; i++){
            String word= str[i];  //eat 

            char[] chararray= word.toCharArray(); // 'e' 'a' 't'

            Arrays.sort(chararray);  // 'a' 'e' 't'
            //String sortedword= chararray.toString(); 
            String sortedword= new String(chararray);  // "aet"


            if( !map.containsKey(sortedword) )
                map.put(sortedword , new ArrayList<>());
 
            map.get(sortedword).add(word); //adding original word
        }
        return new ArrayList<>(map.values());
        
    }
}