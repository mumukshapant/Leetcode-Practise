class Solution {
    public int findMin(int[] nums) {
        int n= nums.length ;

        //binary search ... find a point of rotation 
        //find which side is sorted

        int low=0, high= n-1; 

        int minleft=Integer.MAX_VALUE; 
        int minright=Integer.MAX_VALUE; 
        
        while(low < high){
            
            int mid= low+(high-low)/2 ;

            if(nums[mid] > nums[high] )
                low=mid+1; 

            else 
                high=mid;
            
        }
        return nums[low]; 
        
    }
}

// //try test cases 
// 1)  2 3 4 5 6 
// 2)  1 2 3 4 5
// 3)  3 4 5 1 2