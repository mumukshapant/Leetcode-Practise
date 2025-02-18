class Solution {
    public boolean canFinish(int n, int[][] prereq) {
        List<List<Integer>> adj = new ArrayList<>();
         for(int i=0;i<n; i++)
            adj.add(new ArrayList<>() );

        for (int[] p : prereq) {
            int course = p[1];
            int pre = p[0];
            adj.get(course).add(pre);
        }
        int[] indegree = new int[n]; // contains the preprequisites required to take the course

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j : adj.get(i)) {
                indegree[j]++; 
            }
        }

        for(int i=0;i<n;i++){
            if (indegree[i] == 0)       // you can take the course
                    q.add(i);
        }

        int[] topo = new int[n];
        int index=0; 

        while(!q.isEmpty()){
            int node=q.poll(); 
            topo[index++]= node; 

            for(int j: adj.get(node)){
                indegree[j]--; 
                 if (indegree[j] == 0)       // you can take the course
                    q.add(j);


            }
            

        }
        return index==n; 


    }
}