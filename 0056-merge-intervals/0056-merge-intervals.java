class Solution {
    public int[][] merge(int[][] nums) {
        int n= nums.length;

        Arrays.sort(nums, (a,b)->(Integer.compare(a[0],b[0])));

                List<int[]> list= new ArrayList<>(); 



        int[]curr= nums[0]; // [1,3]
        for(int i=0;i<n;i++){
            if(curr[1]>=nums[i][0]){
                //merge 
                curr[1]=Math.max(nums[i][1],curr[1]);
                
            }else{
                list.add(curr);
            curr=nums[i];}

        }
        list.add(curr);
                return list.toArray(new int[list.size()][]);

    }
}