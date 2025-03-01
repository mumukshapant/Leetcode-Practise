class Solution(object):
    def sortPeople(self, names, heights):
        """
        :type names: List[str]
        :type heights: List[int]
        :rtype: List[str]
        """
        n= len(names)
        d= dict(zip(heights,names))
        res=[]
        sortedKeys = sorted(d.keys(),reverse=True)
        for i in sortedKeys : 
            res.append(d[i])
        return res