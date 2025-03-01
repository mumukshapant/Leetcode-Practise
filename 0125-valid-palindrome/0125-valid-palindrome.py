class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        temp= [ch.lower() for ch in s if ch.isalnum() ]

        rev= temp[::-1]
        print (''.join(temp))
        
        return rev==temp
        