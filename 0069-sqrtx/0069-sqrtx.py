class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        #binary search 
        if x < 2:
            return x
        low=0
        high= x/2
        
        while low<=high: 
            mid= low+(high-low)//2
            
            if mid*mid==x: 
                return mid
            elif mid*mid>x: 
                high=mid-1
            else:
                low=mid+1
        return high

        