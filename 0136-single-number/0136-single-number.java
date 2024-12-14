class Solution {
    public int singleNumber(int[] nums) {
// XOR 

//  0 0 -- 0 
//  1 1 -- 0 
//  0 1    1
//  1 0    1 
 
 int xor=0; 

 for(int i=0;i<nums.length;i++){
   xor = xor^nums[i]; 
 }
 return xor; 

}
}