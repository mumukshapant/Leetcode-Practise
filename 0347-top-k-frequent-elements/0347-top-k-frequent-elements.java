class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        //Steps : 
        /** 
        1. HashMap with freq of els 
        2. Convert hashmap entry  to arraylist 
        3. sort the arrylist by freq of elemts
        4. create an array for top[] k elements. 
        5. chose the k elements from the sorted list e.
        6. return top[]
          
        */
      
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1); 
        }
        
List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
list.sort((a, b) -> b.getValue() - a.getValue()); 
int[] top = new int[k]; 
for(int i=0;i<k;i++){
    top[i]=list.get(i).getKey();
}




return top; 

}

}