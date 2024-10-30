class Solution {
    public long pickGifts(int[] nums, int k) {

        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder()); 
        for(int i:nums) 
            pq.add(i); 

        while(k!=0){
            int first= pq.poll(); 
            pq.add((int)Math.sqrt((int)first)); 
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll(); 
        }
        return sum; 
    }
}