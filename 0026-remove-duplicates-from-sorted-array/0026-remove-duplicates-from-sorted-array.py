class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
# i           j
# 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 
        i=0

        for j in range (1, len(nums)): 
            if nums[i]!=nums[j]: 
                nums[i+1]= nums[j]
                i+=1
        return i+1


