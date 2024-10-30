class Solution {
    public int fillCups(int[] nums) {

        //ref https://www.youtube.com/watch?v=sAy0Ya2hinw

        //max heap 
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder()); 
        for(int i:nums)
            pq.add(i); 

        int res=0; 

        while(!pq.isEmpty()){
            int first= pq.poll(); 
            int second = pq.poll(); 


            if(first<=0 && second<=0)
                break;

            first--; 
            second--; 
            pq.add(first); 
            pq.add(second); 
            res++; 
        }
        return res; 


        
    }
}