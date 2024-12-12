class Solution {
    public int[] plusOne(int[] nums) {
        int n= nums.length; 

        // if last digit is not 9 , then just make a plus one 
        if(nums[n-1]!=9){
            nums[n-1]=nums[n-1]+1; 
            return nums; 
        }else{
            int[] res= new int[n+1]; 
            if(nums[0]!=9)
                {  
                    int temp= nums[0]+1; 
                    Arrays.fill(nums,0); 
                    nums[0]=temp; 
                    return nums; 
                    }

            else    
                res[0]=1; 
            return res; 

        }

        
    }
}