class Solution {
    public boolean find132pattern(int[] nums) {

        int n = nums.length;
        int thirdelement = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            

            while (!st.isEmpty() && nums[i] > st.peek()) 
                thirdelement =st.pop(); 

            
            st.push(nums[i]);
            if (nums[i] < thirdelement)
                return true;

        }
        return false;
    }
}