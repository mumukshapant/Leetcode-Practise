class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //since the constraints are very small , only 101 , we can use brute force
int[] n1= new int[101]; 
int[] n2= new int[101]; 
int[] res= new int[2];
        for(int i: nums1)
            n1[i]++; 

        for(int i:nums2)
            n2[i]++; 

        for(int i=0;i<101;i++){
            if(n1[i]!=0 && n2[i]!=0)
                {
                    res[0]+=n1[i]; 
                    res[1]+=n2[i]; 
                }
        }

        return res; 
    }
}