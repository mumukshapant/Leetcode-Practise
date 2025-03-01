class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        strs= pattern 
        t= s.split()
        

        return map(strs.find, strs)== map(t.index, t )
        