class Solution(object):
    def backspaceCompare(self, s, t):
       
       
        def processstring(x): 
            st=[]
           
            for i in x: 
                if i!='#': 
                    st.append(i)
                    print(st)

                elif len(st)>0 and i=='#': 
                    st.pop()
            return st

        return processstring(s)==processstring(t)
        