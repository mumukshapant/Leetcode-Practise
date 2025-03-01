class Solution(object):
    def plusOne(self, nums):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for i in range (len(nums)-1, -1, -1): 
            if nums[i]+1>9: 
                nums[i]=0
            else: 
                nums[i]= nums[i]+1
                return nums
        
        return [1]+nums

                
        
