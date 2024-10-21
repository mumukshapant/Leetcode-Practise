class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length; 
        int n2=nums2.length; 
        int[] newarr = new int[n1+n2]; 
        int i=0; int j=0; int k=0;  
        while(i<n1 && j<n2){
            if(nums1[i]>nums2[j]){
                newarr[k]=nums2[j]; 
                k++; 
                j++; 
            }else{
                newarr[k]=nums1[i]; 
                k++; i++; 
            }
        }
        //remaining elements
        while(i!=n1){
            newarr[k++]=nums1[i++]; 
        }
        while(j!=n2){
            newarr[k++]=nums2[j++]; 
        }

        int n= newarr.length;
        if (n%2!=0)
            return (double)newarr[n/2]; 
        else {
            int m1=n/2-1;  
            int m2=n/2;
            return (double)(newarr[m1]+newarr[m2])/2.0;
        }





    }
}