class Solution {
    public int getSum(int a, int b) {
    
while(b!=0)
{
    int sum= a^ b ;  // sum without carry 
    int carry = (a&b)<< 1 ; // carry is a&b then left shift it( WHY coz carry is added on the next left digit ) 

    // keep adding ( sum+carry) till carry becomes 0; 


    a= sum; 
    b= carry; 
    }
    return a; 


    }
}