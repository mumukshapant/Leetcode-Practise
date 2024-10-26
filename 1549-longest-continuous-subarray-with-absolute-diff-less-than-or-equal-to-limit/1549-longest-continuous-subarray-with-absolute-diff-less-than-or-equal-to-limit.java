class Solution {
    public int longestSubarray(int[] nums, int limit) {

        //2 deques - one strictly increasing ( min deque), one strictly descreasing ( max )
        Deque<Integer> max = new LinkedList<>(); //mon decreasing
        Deque<Integer> min = new LinkedList<>(); //mon increasing
        int left = 0;
        int len = 0;

        for(int r=left;r<nums.length; r++){

            //max queue always decreasing
            while(!max.isEmpty() && nums[r]>max.peekLast())
                max.pollLast(); 

            max.offerLast(nums[r]); 

            //min q always increasing
            while(!min.isEmpty() && nums[r]<min.peekLast())
                min.pollLast(); 

            min.offerLast(nums[r]); 


            //current window diff exceeds limit? 
            while(max.peek()- min.peek()  > limit){

                if(max.peek()==nums[left])
                    max.poll() ;

                if(min.peek()==nums[left])
                    min.poll(); 

                left++; 
            }

            len=Math.max(len, r-left+1); 

      
        }

        return len;


        
    }
}