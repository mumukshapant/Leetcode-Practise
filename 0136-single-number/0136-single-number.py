class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        freq= Counter(nums)

        for i in freq: #i represents the key
            print(i)
            if freq[i]==1 :  #value 
                return i
        