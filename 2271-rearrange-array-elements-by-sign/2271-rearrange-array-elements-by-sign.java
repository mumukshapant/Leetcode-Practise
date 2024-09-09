class Solution {
    public int[] rearrangeArray(int[] nums) {
        //brute : O(N+N/2) of running time 
        ArrayList<Integer> pos = new ArrayList<>(); 
        ArrayList<Integer> neg= new ArrayList<>();
       // int n= nums.length-1; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 )
                pos.add(nums[i]); 
            else    neg.add(nums[i]); 
        }

        //now add those numbers in nums
        int i = 0;
        int p = 0, n = 0;
        while (p < pos.size() && n < neg.size()) {
            nums[i++] = pos.get(p++);
            nums[i++] = neg.get(n++);
        }
        return nums;
    }
}