class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;

        // // XOR will work only when there is 1 duplicate in the array 

        // int xor = 0;

        // // XOR all elements in the array
        // for (int num : nums) {
        //     xor ^= num;
        // }

        // // XOR all numbers from 1 to n - 1 (not n, because n is not in the range [1, n-1])
        // for (int i = 1; i < n; i++) {
        //     xor ^= i;
        // }


        int neg =0; 
        for(int i=0; i<n ; i++){
            int index= Math.abs(nums[i]);  // 1

            if ( nums[index] < 0 )
                return index; 


            nums[index]= -nums[index]; 
        }

        return -1;
    }
}
