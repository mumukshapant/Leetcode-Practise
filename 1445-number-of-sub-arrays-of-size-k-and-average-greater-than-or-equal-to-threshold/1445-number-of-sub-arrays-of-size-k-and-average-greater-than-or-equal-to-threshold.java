class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
      

        int count=0; 
        int n= nums.length;
        // int sum=0; 

        for(int i=0; i<=n-k ;i++){
            
            int j=i+k; 
            int p=i;
            int sum=0; 

            while(p<j){
                sum+=nums[p];
                p++; 
            }
            System.out.println(sum);
           if( (sum/k) >= threshold)
            count++; 


        }

        // //  first k elements
        // for (int i = 0; i < k; i++) {
        //     sum += nums[i];
        // }

        // if (sum / k >= threshold) 
        //     count++;

        // for (int i = k; i < n; i++) {
        //     sum += nums[i] - nums[i - k]; 
        //     if (sum / k >= threshold) {
        //         count++;
        //     }
        // }
        



        return count; 
        
    }
}