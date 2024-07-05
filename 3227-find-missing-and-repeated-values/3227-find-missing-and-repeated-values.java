class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int[] res= new int[2]; 
        int n= nums.length; 
   


        Map<Integer, Integer> map = new HashMap<>(); 
        
        for(int i=0;i<nums.length; i++){
            for(int j=0;j<nums[0].length; j++){
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0)+1); 
            }
        }
//repeating
        for(Map.Entry <Integer, Integer> e : map.entrySet()){
            if(e.getValue()==2)
                res[0]=e.getKey(); 
        }


for(int i=1; i<=n*n; i++ ){
    if(!map.containsKey(i))
       {
           res[1]=i; 
           break; 
       }
     
}
return res; 

    }
}