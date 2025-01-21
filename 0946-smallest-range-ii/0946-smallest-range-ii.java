class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n= nums.length; 
        Arrays.sort(nums); 

        int range = nums[n-1] - nums[0]; 

        int min=0 , max =0; 

        for(int i =0; i<n-1 ; i++){

            // bade se minus karo, chote mein add karo, taaki dono ka difference minimum rahe.
            min= Math.min( nums[0]+k , nums[i+1]-k ); 

            // bade se subtract karo, chote mein add karo.
            max= Math.max( nums[n-1]-k , nums[i]+k ); 

            range= Math.min(max-min, range) ; 

        }
        return range; 

    }
/**
      1, 2           [[3]]        6, 8, 12, 19 

    take a point on it ( any point , lets take 3 ). this is " a[i] "
   
   (i) all the elements to the left of 3 will have +k 
    ->> {a[0]+k} , a[1]+k ... {a[i]+k}

    (ii) all elements to the right of three will have -K
    ->> {a[i+1]-k} , a[i+2]-k ... {a[n-1]-k}

    (iii) We have 4 values  
    a[0] + k      ,  a[i] + k

    a[i+1] -k    , a[n-1] - k

    (iv) min ( a[0] + k ) & (a[i+1]-k)
         max (a[i]+k) & a[n-1]-k
 */
   


}