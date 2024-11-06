class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0; 


        boolean[] isallowed=new boolean[26]; 

        for(int i=0;i< allowed.length();i++){
            isallowed[allowed.charAt(i)-'a']=true; 
        }



        for(int j=0;j<words.length ;j++){
            String curr= words[j]; 
            boolean flag=true; 

            //every char of the current word

            for(int i=0;i<curr.length(); i++){
                if(!isallowed[curr.charAt(i)-'a']){
                   flag=false; 
                  //  break; 
                }

            }if (flag) {
                count++;
            }


        }

        return count; 
    }
}