class Solution(object):
    def rotateString(self, s, t):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        if len(s)!=len(t): 
            return False
        
        for i in s: 
      #      print(i) # b
        #    print(s[1:]) #cdea 
            s= s[1:] +s[0] #cdeab
     
            if s==t: 
                return True
        return False
        