class Solution(object):
    def removeDuplicates(self, s):
        """
        :type s: str
        :rtype: str
        """
        st=[]
        for ch in s: 
            if st and st[-1] == ch : 
                st.pop()  # Remove the duplicate
            else:
                st.append(ch)  # Add the character to the stack
    
        return ''.join(st)
        