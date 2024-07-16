class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a,b)->Integer.compare(a[0],b[0]) );
        List<int[]> list= new ArrayList<>(); 

        int n=nums.length;

        int[] interval= nums[0]; //1,3

        for(int i=0;i<n;i++){
       
                if(interval[1]>=nums[i][0]){
                    interval[1]= Math.max(nums[i][1],interval[1]);
                    
                }else{
                    list.add(interval);
                interval = nums[i];
                }
            
        }
           // Add the last interval
        list.add(interval);

        return list.toArray(new int[list.size()][]);
        
    }
}