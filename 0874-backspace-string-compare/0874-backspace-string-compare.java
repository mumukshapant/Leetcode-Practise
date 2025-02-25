class Solution {
    public boolean backspaceCompare(String s, String t) {

        int i=s.length()-1; 
        int j= t.length()-1 ; 

        int sskip=0, tskip=0;

        while(i>=0 || j>=0){

            while(i>=0){
                if(s.charAt(i)=='#')
                {
                    sskip++; 
                    i--;
                }else if (s.charAt(i)!='#' && sskip>0)
                {
                    sskip--; 
                    i--;
                }else 
                    break;
            }



            while(j>=0){
                if(t.charAt(j)=='#')
                {
                    tskip++; 
                    j--;
                }else if (t.charAt(j)!='#' && tskip>0)
                {
                    tskip--; 
                    j--;
                }else 
                    break;
            }



            if( i>=0 && j>=0 && s.charAt(i)==t.charAt(j))
            {
                i--; 
                j--;
            }else{
                return (i==-1 && j==-1);
            }









        }
        return true;
        
    }
}