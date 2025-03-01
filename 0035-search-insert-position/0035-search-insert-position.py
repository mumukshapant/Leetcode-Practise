class Solution(object):
    def searchInsert(self, nums, t):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        low=0
        high=len(nums)-1

        while low<=high: 
            mid= low+(high-low)/2

        
            if nums[mid]==t: 
                return mid
            elif nums[mid]> t: 
                high= mid-1
            else: 
                low= mid+1
        return low

        