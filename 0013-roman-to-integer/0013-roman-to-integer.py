class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        #s = "MCM  XC IV"              Output: 1994
        dict = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        prev=0
        res=0

        for i in  s[::-1] : 
            if dict[i] >= prev: 
                res+=dict[i]
            else:
                res-=dict[i]
            prev=dict[i]
        return res


