class Solution {
    public List<String> letterCombinations(String s) {
        
        LinkedList<String> res= new LinkedList<>(); 
        if(s.length()==0)
            return res; 

        res.add(""); // length =0 

        String[] map = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
        for(int i=0;i<s.length(); i++){
            int index= Character.getNumericValue(s.charAt(i));  // s="23"   then index= 2

            while(res.peek().length()==i){
                String t= res.remove(); 

                for(char c: map[index].toCharArray())
                    res.add(t+c); 
                
            } 
        }

        return res; 
    }
}