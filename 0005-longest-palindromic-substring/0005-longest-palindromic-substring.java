class Solution {
    public String longestPalindrome(String s) {
        
    int n= s.length();
    boolean[][] dp= new boolean[n][n];
    int maxLen=1;
    int start=0;

    //length 1 is always a palindrome
    for(int i=0;i<n;i++){
      dp[i][i]=true;
      maxLen=1;
      start =i;
    }

    //length 2
    for(int i=0;i<n-1; i++){
      if(s.charAt(i)==s.charAt(i+1)){
        maxLen=2;
        start=i;
        dp[i][i+1]=true;
      }
    }


    //length =3; 2 loops
    for(int k =2; k<=n;k++){
      for(int i= 0;i<n-k+1;i++ ){
        int j= i+k-1;


        if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j))
        {
          dp[i][j]=true;
          if(maxLen<k) {
            maxLen = k;
            start=i;
          }
        }
      }

    }





 return s.substring(start, start + maxLen);    }
}