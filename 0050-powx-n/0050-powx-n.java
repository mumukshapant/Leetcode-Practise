class Solution {
    public double myPow(double x, int n) {
        return power(x, n); 
        
    }
    private double power(double x, long n){

        double res=0.0; 

        if(n==0)
            return 1; 


         //negative   
        if(n<0){
            res= 1.0/power(x, -n); 
        }

        if(n>0 && n%2==0 ){
            res= power(x*x, n/2); 
        }
        if(n>0 && n%2!=0){
            res= power(x*x, (n-1)/2)*x; 
        }

        return res; 

    }
}