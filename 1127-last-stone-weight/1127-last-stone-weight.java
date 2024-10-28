class Solution {
    public int lastStoneWeight(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        for(int i:nums)
            pq.add(i); 

        while(pq.size()>1){
            int x= pq.remove(); 
            int y = pq.remove(); 
            if(x!=y)
                pq.add(x-y); 
        }
        return pq.isEmpty() ? 0: pq.remove(); 

        
    }
}