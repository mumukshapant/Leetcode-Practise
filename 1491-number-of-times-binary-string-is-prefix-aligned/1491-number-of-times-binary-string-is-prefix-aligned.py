class Solution(object):
    def numTimesAllBlue(self, flips):
        """
        :type flips: List[int]
        :rtype: int
        """
        max_on =0
        shining=0

        for i, bulb in enumerate(flips):
            max_on=max(max_on, bulb)
            if(max_on==i+1):
                shining+=1
        return shining
        