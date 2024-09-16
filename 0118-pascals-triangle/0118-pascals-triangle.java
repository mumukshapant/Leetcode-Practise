class Solution {
    public List<List<Integer>> generate(int n) {
                List<List<Integer>> res = new ArrayList<>(); 

        if(n==0)
        return res; 

        List<Integer> firstrow= new ArrayList<>(); 
        firstrow.add(1); 

        res.add(firstrow); 
        if(n==1)
        return res; 

        for(int i=1;i<n;i++){
           List<Integer> prevrow= res.get(i-1); 
                   List<Integer> row= new ArrayList<>(); 


            row.add(1); 
            for(int j=0;j<i-1;j++)
                row.add(prevrow.get(j)+prevrow.get(j+1));

            row.add(1);
            res.add(row);  

        }
        

        
        return res;
        
    }
}