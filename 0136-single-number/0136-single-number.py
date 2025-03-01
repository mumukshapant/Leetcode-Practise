class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # time & space : O(N), O(N)
        # freq= Counter(nums)

        # for i in freq: #i represents the key
        #     print(i)
        #     if freq[i]==1 :  #value 
        #         return i

        # XOR 
        # space : O(1), time O(N)
        
        xor=0
        for i in nums: 
            xor=xor^i
        return xor
        