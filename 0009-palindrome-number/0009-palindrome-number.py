class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
    # O(log n )-- reversing half the number

        if x<0 or (x % 10 == 0 and x != 0): 
            return False
        
        rev=0
        while x> rev: 
            rem=x%10
            rev= rev*10 + rem
            x=x//10
        return x==rev or x==rev//10        