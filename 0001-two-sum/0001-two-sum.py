class Solution(object):
    def twoSum(self, nums, t):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict={}
        res=[]
        

        for i in range (0, len(nums)): 
            rem= t-nums[i]
            if rem in dict: 
                return [dict[rem],i ] 
                
            dict[nums[i]]= i 
        
        return res