class Solution(object):
    def findRepeatedDnaSequences(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        res= set()
        seen = set()

        for i in range(0,len(s)-9):
            temp = s[i:i+10]
            if temp in seen: 
                res.add(temp)
            seen.add(temp)
        
        return list(res)
        