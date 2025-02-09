class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length; 
System.out.print(n); 
        List<Integer>[] bucket = new List[n+1]; 
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int i=0;i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1); 
        }

        for(int i: map.keySet()){
            int freq= map.get(i); // [1] -> 3

            if(bucket[freq]==null)
                bucket[freq]= new ArrayList<>(); 
            
            bucket[freq].add(i); 
        }

        int[] res= new int[k]; 
        int count=0; 
        
        for(int i=bucket.length-1; i>=0 ; i--){
            if( bucket[i]!=null) 
            {
                for(Integer num: bucket[i]){

                    if(count<k) 
                    {
                        res[count]= num; 
                        count++; 
                    }

                }
            }

        }

    return res; 
        
    }
}