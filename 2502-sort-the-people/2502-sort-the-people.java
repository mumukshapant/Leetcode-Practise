class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Map<String, Integer> map = new HashMap<>(); 
        // for(int i=0;i<names.length;i++){
        //     map.put(names[i], heights[i]); 
        // }
        //Collections.sort(map); 
        String[] res= new String[names.length]; 
        for(int i=0;i<names.length;i++){
            for(int j=0;j<heights.length;j++){
            if(heights[i]>heights[j]){
                int temp= heights[j]; 
                heights[j]=heights[i]; 
                heights[i]=temp; 

                String stemp = names[j]; 
                    names[j]= names[i]; 
                    names[i]= stemp; 
            }
            }
        }
        return names; 
    }
}