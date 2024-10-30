class Solution {
    public int minimumOperations(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int count = 0;
        boolean check = true;

        while (check) {
            for (int i : nums)
                {
                    if(i!=0)
                        pq.add(i) ;
                }

            if (pq.isEmpty()) {
                check = false;
                break;
            }

            int first = pq.peek();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[i] -= first;
                }
            }
            count++;

            if (!pq.isEmpty())
                pq.clear();

        }
        return count;

    }
}