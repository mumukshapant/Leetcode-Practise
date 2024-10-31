class Solution {
    public int firstMissingPositive(int[] temp) {
        int n= temp.length; 
        int[] nums = new int[n+1];
        Arrays.fill(nums, 0);  
        System.arraycopy( temp, 0, nums, 0, n);
        int newlen=n+1; 

        for(int i=0;i<newlen; i++){
            if (nums[i] <0 || nums[i]>(newlen)){
                nums[i]=n+1; 
            }
            

        }
        cyclicsort(nums); 
        for(int i=0;i<newlen ;i++){
            if(nums[i]!=i){
                return i; 
            }
        }

return newlen;

    }
    private  void cyclicsort(int[] nums){

    int n= nums.length;

    int i=0;

    while (i < n ){
     int correctindex=nums[i];

      if(nums[i] < nums.length && nums[i]!=nums[correctindex]){
        int temp = nums[i];
        nums[i] = nums[correctindex];
        nums[correctindex] = temp;

      }
      else
        i++;
    }


  }
}