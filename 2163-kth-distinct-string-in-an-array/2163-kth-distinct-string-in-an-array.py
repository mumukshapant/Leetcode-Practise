class Solution(object):
    def kthDistinct(self, arr, k):
        """
        :type arr: List[str]
        :type k: int
        :rtype: str
        """
        s = Counter(arr)
        print(s)
        res = []
        
        for i in arr:
            print(i)
            if s[i] == 1:
                res.append(i)
                

        if len(res) >= k:
            return res[k-1]
        else:
            return ""