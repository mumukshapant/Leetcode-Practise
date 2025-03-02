class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        res= []
        for i in s.split(" "): 
            res.append(i[::-1])

        return ' '.join(res)
        