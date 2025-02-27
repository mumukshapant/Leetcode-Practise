class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sign =1 
        rev=0

        if x>0: 
            sign= 1
        else: 
            sign=-1

        x=abs(x)

        while x: 
            x, mod = divmod(x, 10) # x: quotient, mod = remainder
            rev= rev*10+ mod
            
        if rev> 2**31 -1 : 
            return 0 

        return sign*rev


        # The divmod(x, 10) function returns a tuple (quotient, remainder), but you are assigning it directly to x, which leads to incorrect behavior.