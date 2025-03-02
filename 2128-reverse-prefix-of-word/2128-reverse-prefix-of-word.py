class Solution(object):
    def reversePrefix(self, s, ch):
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        
        index = s.find(ch)
       
        rev= s[:index+1][::-1]+s[index+1:]
        print(rev)
        return rev
        