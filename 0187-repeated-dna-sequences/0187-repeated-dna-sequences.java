class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set1= new HashSet<>(); 
        Set<String> set2= new HashSet<>(); 

        for(int i=0;i<=s.length()-10; i++){
            String sub= s.substring(i,i+10); 

            if(set1.add(sub)==false) //means set1 already contains it
            {
                set2.add(sub); 
            }
        }
        return new ArrayList<>(set2);
    }
}