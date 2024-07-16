class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //since the constraints are very small , only 101 , we can use brute force
int count=0; 
int[] res= new int[2];
        for(int i=0;i< nums1.length; i++){
              for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    count++; 
                    break;
                }
              }
        }
        res[0]=count; 

        //reset count=0 for nums2 common 
count=0; 
        for(int i=0;i< nums2.length; i++){
              for (int j = 0; j < nums1.length; j++) {
                if(nums2[i]==nums1[j]){
                    count++; 
                    break;
                }
              }
        }
        res[1]=count; 

        return res; 
    }
}