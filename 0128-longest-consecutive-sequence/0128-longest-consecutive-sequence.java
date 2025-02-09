class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n= nums.length; 
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        int maxlen=1, len=1; 
    

    if(nums.length==0)
            return 0; 


        
        for(int i=0;i<n; i++){

            pq.add(nums[i]); 

        }
   
        int prev= pq.poll(); 

        while(!pq.isEmpty()){
            int curr= pq.poll(); 
            
            if( curr-prev == 1 ){
                len++; 
                prev= curr; 

            }
            else if(prev==curr)
                prev = curr; 
            else
            {
                    prev= curr; 
                    len=1; 
            }

                maxlen= Math.max(maxlen, len); 

        }return maxlen;

}}