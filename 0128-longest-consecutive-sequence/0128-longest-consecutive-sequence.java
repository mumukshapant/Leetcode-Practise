class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0; 

     PriorityQueue<Integer> pq = new PriorityQueue<>(); 
     for(int i=0;i<nums.length;i++)
        pq.add(nums[i]); 
    

    int prev= pq.poll(); 
    int len=1; 
    int maxlen = 1; 

    while(!pq.isEmpty()){
        int curr= pq.poll(); //1 
        if(curr-prev==1)
        {
            len++; 
            prev=curr; 
        }
        else if (prev==curr)
            prev=curr; 
        else 
        {
            prev = curr; 
            len=1; //reset 
        }
                    maxlen= Math.max(maxlen, len); 



    }
return maxlen; 


    }
}