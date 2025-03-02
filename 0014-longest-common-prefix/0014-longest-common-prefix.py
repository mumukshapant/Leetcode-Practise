class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefix= strs[0] #dog
        
        plen=len(prefix)
        

        for i in range (1, len(strs)): 
            curr= strs[i] #racecar
            while prefix[:plen] != curr[:plen] or plen> len(curr)  : 
                plen -= 1
                if plen==0 : 
                    return ""
            prefix= prefix[:plen]
            #print(prefix)

        return prefix  
                



        