class Solution {
    public int bulbSwitch(int n) {

        // 1 1 1 1 1 1 1 ON 
        // 0 0 0 0 0 0 0 OFF
        // 
        if(n==0)
            return 0; 
        if(n==1)
            return 1; 

        

        return (int)Math.sqrt(n); 
    }
}