class Solution(object):
    def titleToNumber(self, n):
        """
        :type columnTitle: str
        :rtype: int
        """
        res=0
     #   print(ord('A'))
        for i in n: 
            res= res*26 +( ord( i ) - ord('A') +1)


        return res