class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict={
            'I': 1, 
            'V': 5, 
            'X' : 10, 
            'L': 50, 
            'C': 100, 
            'D' : 500, 
            'M' :1000
        }
        curr=0
        res=0

        for i in range (len(s)-1, -1, -1): 
            if dict[s[i]]>=curr: 
                res+=dict[s[i]]
            else:
                res-=dict[s[i]]
            curr=dict[s[i]]
        
        return res
