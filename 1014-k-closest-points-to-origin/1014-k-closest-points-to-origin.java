class Solution {
    public int[][] kClosest(int[][] nums, int k) {
        int n= nums.length ; 
        int[][] dist= new int[n][3];

        //sort as per distance
        PriorityQueue<Integer> pq= new PriorityQueue<>(); 

        for(int i=0;i<nums.length;i++){

            int x= nums[i][0] ; 
            int y= nums[i][1] ; 

            int d= x*x+y*y ;

            dist[i][0]= d; 
            dist[i][1]= x; 
            dist[i][2] = y; 

          //  pq.offer(dist[0]) ;


        }

       // distance ke basis par array "dist" ko sort karo 
        Arrays.sort(dist, (a,b)->Integer.compare(a[0],b[0])) ;

        int[][] res = new int[k][2]; 
        for(int i=0;i<k; i++){

            res[i][0] = dist[i][1]; 
            res[i][1]= dist[i][2]; 
          //  res[i][2]= dist[i][0];

        }
return res; 

    }
}