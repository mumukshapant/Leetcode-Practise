class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int i:nums)
            p.add(i); 

        int product=1; 
        product*=(p.poll()-1); 
        product*=(p.poll()-1); 

        return product; 
        
    }
}