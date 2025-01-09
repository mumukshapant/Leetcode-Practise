class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int max=0, count=1, n=nums.length; 

        PriorityQueue<Integer> pq= new PriorityQueue<>(); 
        for(int i=0;i<n; i++){
            pq.add(nums[i]); 
        }

        int prev=0,curr=0; 
         prev=pq.poll(); 

       while(!pq.isEmpty()){
        curr=pq.poll(); 
       

        if(prev==curr)
           prev=curr; 

        else if (curr-prev==1)
        {
            count++; 
            max= Math.max(count, max); 
            prev=curr; 
        }
        else{

            //reset counter

            count=1 ; 
            prev=curr;
        }

        
       }
        return Math.max(count, max); 
    }
}