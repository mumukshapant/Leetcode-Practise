class Solution {
    public long MOD= 1_000_000_007;
    public int countGoodNumbers(long n) {

        // at every palce, the digit can be between 0 - 9
        // even digit can be 2,4,6,8
        // prime can be 2,3,5,7
        long odd = n / 2;
        long even = (n + 1) / 2;
        long result = (power(5, even) % MOD * power(4, odd) % MOD) % MOD;


        return  (int)result; 

    }

    private long power(long x, long n) {

        if (n == 0)
            return 1;

        //x=x%MOD; 

        if (n % 2 == 0)
            return power((x * x)%MOD, n / 2)%MOD;
        else
           // return x * power((x * x)%MOD, (n - 1) / 2);
            return (x * power((x * x) % MOD, (n - 1) / 2)) % MOD;


    }
}
