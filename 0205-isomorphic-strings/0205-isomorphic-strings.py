class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t): 
            return False
        
        return map(s.find, s)== map(t.find, t)

        #s.find('a') → returns index 0 [ always the first index]
        #s.find('b') → returns index 1
        # s.find('c') → returns index 2