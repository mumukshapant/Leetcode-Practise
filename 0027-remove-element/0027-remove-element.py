class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        #remove all occurence of val 
        n = len(nums)
        j=0
        i=0
        
        while i<len(nums): 
            if nums[i]!=val:
                nums[j]=nums[i]
                i+=1
                j+=1
                
            else: 
                i+=1

        return j