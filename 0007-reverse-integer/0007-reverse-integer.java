class Solution {
    public int reverse(int x) {
        boolean neg=false; 

        if (x<0)//negative{
           { neg=true; 
            x=Math.abs(x); }
        
        long sum=0; 
        while(x!=0){
            int rem=x%10; 
            sum=rem+sum*10;
           // System.out.print(sum);
            x=x/10;
        }
       // System.out.print(x);
       if(sum>Integer.MAX_VALUE ||sum<Integer.MIN_VALUE)
            return 0; 
        
        
        return neg==true?(-1)*(int)sum:(int)sum;
        
    }
}