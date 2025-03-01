class Solution(object):
    def reversePrefix(self, word, ch):
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        index= word.find(ch)
        

        reversed_prefix= word[:index+1][::-1] + word[index+1:]
        return reversed_prefix