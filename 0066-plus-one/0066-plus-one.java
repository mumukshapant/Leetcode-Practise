class Solution {
    public int[] plusOne(int[] digits) {

        //2 cases : 
       // 1. if last digit + 1 >9 

       for(int i=digits.length-1;i>=0; i--){
        if(digits[i]+1!=10){
             digits[i]+=1;
             return digits;  

        }
        digits[i]=0; 
        

       
       } 

       int[] newdigits = new int[digits.length+1]; 
        newdigits[0]=1; 

       return newdigits; 
        
    }
}