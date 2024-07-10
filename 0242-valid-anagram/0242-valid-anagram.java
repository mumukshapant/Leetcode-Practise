class Solution {
    public boolean isAnagram(String s, String t) {
Map<Character, Integer> map = new HashMap<>(); 

Map<Character, Integer> map1 = new HashMap<>(); 

for(int i=0;i<s.length(); i++){
    map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1); 

}  

for(int i=0;i<t.length(); i++){
    map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i),0)+1); 
    
}  

return map.equals(map1); 
    }
}