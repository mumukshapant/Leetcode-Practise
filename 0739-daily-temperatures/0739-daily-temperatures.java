class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        
        Stack<Integer> st= new Stack<>(); 
        // the stack will be monotonic decreasing means the top element will be the highest, and then others in descreasing order. 
        // Eg : 75, 74, 73, 70, etc 
        
        int[] res = new int[n] ;
        //Arrays.fill(res,0); 

        
        for(int i=0;i<n; i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                //nums[i] = 74
                int j= st.pop(); // 0
                res[j] = i-j;   
            }
            st.push(i);
            


        }
return res; 

    
        
    }
}