class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict={}
        for s in strs:  # s= eat 
            sort= ''.join(sorted(s))

            if sort in dict: 
                dict[sort].append(s)
            else : 
                dict[sort]= [s] 

        return dict.values()