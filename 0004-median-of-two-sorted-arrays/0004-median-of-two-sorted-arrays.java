//time is O(m+n) 

//space is O(m+n) 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;
        int k=0; 
        int[] nums = new int[m + n ];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k] = nums1[i];
                i++; 
            } else {
                nums[k] = nums2[j];
                j++;
            }

            k++;

        }

        // remainig el
        while (i != m) {
            nums[k] = nums1[i];
            i++;
            k++; 
        }

        while (j != n) {
            nums[k] = nums2[j];
            j++;
            k++; 
        }

       int l= nums.length ; 
       //even
       int mid=l/2;
       if(l%2==0)
       return (nums[mid]+nums[mid-1])/2.0; 


       return nums[mid];
    }
}