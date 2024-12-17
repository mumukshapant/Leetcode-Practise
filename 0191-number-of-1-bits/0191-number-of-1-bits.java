class Solution {
    public int hammingWeight(int n) {
        //int data type is a 32-bit signed 
        // & is bitwise AND
        // sets the result bit to 1 only if both bits are 1. Otherwise, the result is 0.
        
        int count=0; 
        for(int i=0;i<32 ; i++){
            if(( ( n>> i )& 1 ) ==1 )
                count++; 

        }
        return count;
    }
}