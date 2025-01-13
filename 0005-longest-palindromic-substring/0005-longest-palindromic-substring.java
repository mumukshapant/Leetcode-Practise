class Solution {
    public String longestPalindrome(String s) {

        // there are 2 cases - even and odd length 
        // if the palindrom is odd : babab , we chose a middle char b and move left and right if mid==i , we compare i-1, i+1 then i-2 and i+2 and so on
        // for even  baab we have i at say 1 and compare it with pointer at 2 

        // the only difference between both cases is how low and high is handled.

        int n= s.length(); 
        if(n <=1 )
            return s; 
        
        String lps=""; 
        

        //odd 
        for(int i=1;i<n;i++ ){
            int low=i, high=i; 
            while(s.charAt(low)==s.charAt(high))
            {
                low--; 
                high++; 
            
                if(low==-1 || high== n)
                    break; 
            }

            String res= s.substring(low+1, high);
            if(res.length()> lps.length())
                lps=res; 
            
        }

        //even 
        for(int i=1;i<n;i++){
            int low=i-1; 
            int high= i; 

            while(s.charAt(low)==s.charAt(high))
            {
                low--; 
                high++; 
                if(low==-1 || high==n)
                    break; 
                
            }

            String res= s.substring(low+1 , high); 

            if(res.length()>lps.length())
                lps=res; 
        }

        return lps; 



    }
}

/**
 * The difference between LPSubstring and subsequence is ::
 * 
 * s = "forgeeksskeegfor"
 * 
 * LP Substring → Requires contiguous characters.
 * Example: "geeksskeeg" is valid.
 * 
 * LP Subsequence → Allows non-contiguous characters.
 * Example: "fgsskssgf" is valid.
 */