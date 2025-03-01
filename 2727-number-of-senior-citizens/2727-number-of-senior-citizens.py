class Solution(object):
    def countSeniors(self, s):
        """
        :type details: List[str]
        :rtype: int
        """
        count=0
        
        for i in s:
            strs=i[11:13]
            if int(strs)>60:
                count+=1
    
        return count

        