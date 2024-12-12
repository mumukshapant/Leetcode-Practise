class Solution {
    public int[][] kClosest(int[][] nums, int k) {
        
        int[][] dist= new int[nums.length][3];

        for(int i=0;i<nums.length ; i++){
            int x= nums[i][0]; // 1
            int y= nums[i][1]; // 3
            
            int d= x*x + y*y; 
            
            dist[i][0]=d; 
            dist[i][1]=x; 
            dist[i][2]=y;
       }

       //d ke basis par "dist" array ko sort karo 
       Arrays.sort(dist, (a,b) ->Integer.compare( a[0],b[0] )   );

       int[][] res= new int[k][2]; 

       for(int i=0;i<k; i++){
        res[i][0]=dist[i][1]; 
        res[i][1]= dist[i][2]; 
       }

       return res;

    }
}