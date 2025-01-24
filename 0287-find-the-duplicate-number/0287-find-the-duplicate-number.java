class Solution {
    public int findDuplicate(int[] nums) {

        int n= nums.length ; 
        int slow= nums[0]; 
        int fast= nums[0]; 

        do{
            slow= nums[slow]; 
            fast= nums[nums[fast]]; 
            
        }while(slow!=fast);

        // slow = nums[0]; // Reset slow to the start of the array
        // while (slow != fast) {
        //     slow = nums[slow]; // Move one step
        //     fast = nums[fast]; // Move one step
        // }

        return slow; 

        
    }
}