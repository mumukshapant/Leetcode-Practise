class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        
        prefix = strs[0] # car
        
        i=1
        prefixlen= len(prefix) 

        for i in range (1,len(strs)): 
            word= strs[i]
            while prefixlen > len(word) or prefix[:prefixlen] != word[:prefixlen]: 
                prefixlen-=1
                if prefixlen==0: 
                    return ""
            prefix = prefix[:prefixlen]

        return prefix