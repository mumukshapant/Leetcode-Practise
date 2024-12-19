class Solution {
    public int minimumOperations(int[] nums) {

//smallest element --1 
boolean flag= true; 
int count=0; 

PriorityQueue<Integer> pq= new PriorityQueue<>();
while(flag){
        for(int i=0;i<nums.length ;i++)
            {
                if(nums[i]!=0)
                    pq.add(nums[i]); 
                
            } 


            if(pq.isEmpty())
            {
                flag=false; 
                break;
            }

            int x= pq.poll(); //1 
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                    nums[i]-=x;
            }

            count++; 

            pq.clear(); 
            
            }
            return count; 
        
    }
}