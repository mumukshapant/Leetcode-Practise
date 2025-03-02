class Solution(object):
    def vowelStrings(self, words, i, j):
        """
        :type words: List[str]
        :type left: int
        :type right: int
        :rtype: int
        """
        vowels= "aeiouAEIOU"
        count=0

        for pointer in range(i,j+1): 
            if words[pointer][0] in vowels and words[pointer][-1] in vowels: 
                count+=1
        
        return count

        