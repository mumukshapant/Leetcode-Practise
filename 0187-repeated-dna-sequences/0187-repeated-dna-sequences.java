class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> res= new HashSet<>();
        Set<String> set= new HashSet<>(); 
//  0
// 10 
// 1, 11
// 2, 12


        for(int i=0;i<=s.length()-10; i++){
            String temp= s.substring(i,i+10) ;
            if(set.contains(temp) ) 
                res.add(temp); 

            set.add(temp); 
            

        }
        return new ArrayList<>(res); 
    }
}