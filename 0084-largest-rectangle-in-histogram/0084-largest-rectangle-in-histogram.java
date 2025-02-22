class Solution {
    public int largestRectangleArea(int[] nums) {

        int n= nums.length; 
        int area=0; 
        //why sliding window does not work here? Because the bars in a rectangle must be * continuous *

        Stack<Integer> st= new Stack<>(); //stores index 
     
        for(int i=0;i<=n; i++)
        {
            while (!st.isEmpty() && (n==i || nums[i] <= nums[st.peek()])) {
                int pop= st.pop(); 
                int h= nums[pop]; 
                int w= st.isEmpty()? i : i-st.peek()-1; 
                 area = Math.max(h * w, area);

            }
            st.push(i); 
        }
        return area; 

        
    }
}