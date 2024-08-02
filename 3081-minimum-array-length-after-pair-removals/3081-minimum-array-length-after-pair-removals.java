class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n= nums.size(); 
        int i=0, j= n/2;


        int count=n; 

        while(i<n/2 && j<n){
            if(nums.get(i)<nums.get(j))
            {
                i++; 
                count=count-2; 
            }
            j++; 
        }
        return count;
    }
}