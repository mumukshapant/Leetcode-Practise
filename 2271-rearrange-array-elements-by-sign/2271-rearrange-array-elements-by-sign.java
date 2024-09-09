class Solution {
    public int[] rearrangeArray(int[] A) {
         int posIndex = 0, negIndex = 1;
         int n= A.length; 
         int[] ans = new int[A.length];
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (A[i] < 0) {
                ans[negIndex]= A[i];
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans[posIndex]= A[i];
                posIndex += 2;
            }
        }

        return ans;
    }
}