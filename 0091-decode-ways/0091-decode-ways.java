class Solution {
    public int numDecodings(String s) {
        int n= s.length(); 

        // since we know we are getting a TLE with recursion because it is repeatedly calculating and returning values, instead of repeatedly calculating values, we use memoization ( DP ) to avoid TLE , 
        // we use a DP table to store the values

        int[] dp = new int[n]; 
// List<Integer > dp = new  ArrayList<>(); 

        Arrays.fill(dp, -1) ;

        return backtrack(s, 0,dp); 
    
    }
    private int backtrack(String s, int i , int[] dp ){
        if(i==s.length())
            return 1; 
        
        if(s.charAt(i)=='0')
            return 0; 

        if(dp[i]!=-1)
            return dp[i]; 
        
        dp[i]= backtrack(s, i+1,dp); //single digit

        if(i+1 < s.length() && Integer.parseInt(s.substring(i, i+2))<=26)
            dp[i]=backtrack(s,i+1,dp)+backtrack(s, i+2,dp); //double digit 
        
        return dp[i]; 
    }
}