class Solution {
    public int fillCups(int[] A) {

         int mx = 0, sum = 0;
        for(int a: A) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);


        // sum+1 because if there are odd number of cups, we account for +1 cup 
        // ( /2 ) because 2 max cups 

    }
}