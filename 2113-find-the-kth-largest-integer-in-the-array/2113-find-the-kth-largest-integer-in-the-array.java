import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        //min heap
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) 
            pq.offer(new BigInteger(nums[i]));
        

        for (int i = k; i < nums.length; i++) {

            BigInteger n = new BigInteger(nums[i]);

            if (n.compareTo(pq.peek()) > 0) {

                pq.poll();
                pq.offer(n);

            }

        }

        return pq.peek().toString();
    }
}
