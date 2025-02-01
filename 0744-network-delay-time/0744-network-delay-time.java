class Solution {
    public int networkDelayTime(int[][] time, int n, int k) {

        // steps 1: create adj list 

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for(int[] i : time) {
            int u= i[0]; 
            int v= i[1]; 
            int w= i[2]; 
            
            map.putIfAbsent(u, new HashMap<>());
            map.get(u).put(v, w);
        }


        // STEP 2: Dist arr[] which will store source to all 
        int[] dist= new int[n+1]; 
        Arrays.fill(dist, Integer.MAX_VALUE); 
        dist[k]=0;                              //dist of source to souce is 0 

        

        // STEP 3:: Queue 

        Queue<int[]> q = new LinkedList<>(); // { v, w }

        q.add(new int[]{k, 0}); 

        while(!q.isEmpty()){
            int[] curr= q.poll();  // curr= {0,0}

            int currnode= curr[0]; 
            int currwt= curr[1]; 

            for(int next: map.getOrDefault(currnode, new HashMap<>()).keySet() )
            {
                int nextwt= map.get(currnode).get(next);

                if(currwt+ nextwt < dist[next] ){
                    dist[next]= currwt+nextwt; 
                    q.add(new int[]{next, currwt + nextwt}) ; 
                }
            }
        }


        // STEP 4: 
        int res=0; 
        
        for(int i=1; i<=n ;i ++){
            if(dist[i]> res)
                res= Math.max(res, dist[i]); 
        }

        return res == Integer.MAX_VALUE ? -1 : res;

        
    }
}