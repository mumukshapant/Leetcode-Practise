class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s=s.strip().split(" ")
        n= len(s)

        return len(s[n-1] )
        