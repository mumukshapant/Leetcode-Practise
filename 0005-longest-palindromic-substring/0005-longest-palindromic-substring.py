class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        lps= ""
        if len(s)==1: 
            return s
        
        #odd
        for i in range (0,len(s)): 
            low=i
            high=i

            while low>=0 and high<len(s) and s[low]==s[high]: 
                low-=1
                high+=1
            res= s[ low +1 : high]
            if(len(res) > len(lps)): 
                lps= res

        for i in range(0,len(s)): 
            low=i
            high=i+1
            while low>=0 and high<len(s) and s[low]==s[high]: 
                low-=1
                high+=1
            res= s[ low + 1: high]
            if len(res)> len(lps): 
                lps= res
        
        return lps
