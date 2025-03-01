class Solution(object):
    def areOccurrencesEqual(self, s):
        """
        :type s: str
        :rtype: bool
        """
        freq = Counter(s)
        return len(set(freq.values()) ) ==1
        