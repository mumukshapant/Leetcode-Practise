class Solution {
    public int numDistinct(String s, String t) {

        int m= s.length(); 
        int n= t.length(); 
        int[][] memo= new int[m][n]; 

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return helper(s, t, 0, 0, memo); 
        
    }
    private int helper(String s, String t, int i, int j, int[][] memo){

        int m= s.length(); 
        int n= t.length(); 

        if(j==n) //string matches 
            return 1;

        if(i==m) //nothing matches
            return 0; 

        int take = 0, not_take = 0;

        if(memo[i][j]!=-1) //means already visited
            return memo[i][j]; 

        if( s.charAt(i)==t.charAt(j) )
            take = helper(s, t, i+1, j+1, memo) ; 
       

        not_take= helper(s, t, i+1, j, memo);

        memo[i][j]= take+not_take; 


        return memo[i][j]; 
    }
}