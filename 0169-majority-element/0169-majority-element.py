class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # moores voting algorithm 
        candidate = nums[0] 
        count=1

        for i in range(1,len(nums)): 
            if nums[i]==candidate: 
                count+=1
            else :
                count -=1 #reset 
                if count==0 :
                    candidate=nums[i]
                    count=1
        return candidate