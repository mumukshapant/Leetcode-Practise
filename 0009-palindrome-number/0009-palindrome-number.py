class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        og=x
        if x < 0:
            return False  # Negative numbers are not palindromes
        rev=0

        while x: 
            x, mod= divmod(x, 10)
            rev= rev*10+ mod

        return rev==og
        