class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        res=""
        m= len(word1)
        n= len(word2)
        i=0
        j=0

        while i<m and j<n: 
            res= res+ word1[i]
            res= res+word2[j]
            i+=1
            j+=1
            
        
        # remaining chars from word1 
        while i!=m : 
            res= res+ word1[i]
            i+=1
        while j!=n: 
            res= res+ word2[j]
            j+=1

        return res
        