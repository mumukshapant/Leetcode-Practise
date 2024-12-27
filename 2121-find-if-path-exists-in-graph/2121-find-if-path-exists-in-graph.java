class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {

        //n is the number of nodes
        List<List<Integer>> graph=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add( new ArrayList<>()  );
        }

        for(int[] e : edges){
            int u= e[0]; 
            int v= e[1];

            graph.get(u).add(v); 
            graph.get(v).add(u); 
        }
        Queue<Integer> q= new LinkedList<>(); 
        boolean[] visited= new boolean[n]; 

        visited[s]=true; 
        q.add(s); 
        while(!q.isEmpty()){
            int curr= q.poll();  // 0 

            if(curr==d)
                return true; 
            
            //now iterate the adjacency list 
            for(int node:graph.get(curr)){
                // curr=[0]

                // in the graph adjacency list : 
                // vertex 0 : [ 1 ]
                // vertex 1 : [ 0, 2 ]
                // vertex 2 : [ 1 ]

                //if curr=0, then node will be [1]

                if( visited[node] ==false )// if node is not visited
                {
                    visited[node]=true; 
                    q.add(node); 
                }
            }
        }

        return false; 
        
    }
}