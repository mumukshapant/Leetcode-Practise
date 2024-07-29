class Solution {
    //ref : https://www.youtube.com/watch?v=icrP7cVgLuM
    public boolean validPath(int n, int[][] edges, int s, int des) {
        List<Integer>[] graph = new ArrayList[n]; 
        boolean[] visited= new boolean[n]; 

        for(int i=0;i<graph.length; i++)
            graph[i]= new ArrayList<>(); 
        
        for(int[] e: edges){
            int v1= e[0]; 
            int v2= e[1]; 

            graph[v1].add(v2); // add v2 to adj list of v1 
            graph[v2].add(v1); // add v1 to adj list of v2 cus Bi Directional

        }

        return isPath(graph, s, des, visited); //adj list, source, dest, visited
    }

    private boolean isPath(List<Integer>[] graph, int s, int d, boolean[] visited){
        if(s==d)
            return true; 

        visited[s]= true; 

        for(int nbr:graph[s]){
       
            if(visited[nbr]==false) //neighbor is not yet visited
            {
                if(isPath(graph, nbr, d, visited))
                    return true; // and there exists a path bw nbr and destination
            }
        }
        return false; 
    }

    
}