class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        dict={} #stores indicdes
        for i in range (0, len(nums)): 
            if nums[i] in dict: 
                if(abs(i-dict[nums[i]])<=k): 
                    return True

            dict[nums[i]] = i

        return False
            