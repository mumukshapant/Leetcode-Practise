class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        
        d={}
        for word in strs: 
            sortedword= ''.join(sorted(word)) # sorts characters then joins it to create a string        # aet
            if sortedword not in d: 
                d[sortedword]= [word]
            else: 
                d[sortedword].append(word)
        
        list=[]
        for values in d.values(): 
            list.append(values)
        return list


      