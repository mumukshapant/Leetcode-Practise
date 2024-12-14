class Solution {
    public double myPow(double x, int n) {
        // x^n 
        return helper(x, (long)n);
    }
    private double helper(double x, long n){
        if(n==0)
            return 1; 
        
        if(n<0) //negative
            return  1.0/ helper(x, -n) ; 

        if(n%2==0){
            return helper(x*x, n/2 );
        }else{
            return x * helper(x*x, (n-1)/2); 

        }
    }
}