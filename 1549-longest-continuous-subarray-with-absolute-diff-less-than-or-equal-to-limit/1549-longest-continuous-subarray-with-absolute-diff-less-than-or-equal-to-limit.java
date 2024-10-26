class Solution {
    public int longestSubarray(int[] nums, int limit) {

        //2 deques - one strictly increasing ( min deque), one strictly descreasing ( max )
        Deque<Integer> max = new LinkedList<>(); //mon decreasing
        Deque<Integer> min = new LinkedList<>(); //mon increasing
        int left = 0;
        int len = 0;

        for(int r=0;r<nums.length; r++){

            //max queue always decreasing
            while(!max.isEmpty() && nums[r]>max.peekLast())
                max.pollLast(); 

            max.offerLast(nums[r]); 

            //min q always increasing
            while(!min.isEmpty() && nums[r]<min.peekLast())
                min.pollLast(); 

            min.offerLast(nums[r]); 


            //current window diff exceeds limit? 
            while(max.peekFirst()- min.peekFirst()  > limit){

                if(max.peekFirst()==nums[left])
                    max.pollFirst() ;

                if(min.peekFirst()==nums[left])
                    min.pollFirst(); 

                left++; 
            }

            len=Math.max(len, r-left+1); 

      
        }

        return len;


        
    }
}