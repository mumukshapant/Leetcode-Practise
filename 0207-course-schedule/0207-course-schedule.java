class Solution {
    public boolean canFinish(int n, int[][] prereq) {

        List<List<Integer>> adj= new ArrayList<>(); 

        for(int i=0;i<n ; i++)
        {
            adj.add(new ArrayList<>()); 
        }
        for(int[] p : prereq){
            int course= p[0]; // course
            int prerequisite= p[1]; 

            adj.get(course).add(prerequisite); 
        }

        System.out.println("adjacency list"); 
        for(int i=0;i<n; i++)
            System.out.println(i+": "+adj.get(i)+" "); 

        int[] indegree= new int[n]; 


        //given : courses - labeled from 0 to numCourses - 1.

        for(int i=0;i<n ; i++){
            for(int j: adj.get(i)){
                indegree[j]++; 

            }
        }
          System.out.println("\n"); 

          System.out.println("Initial Indegree array"); 
        for(int i=0;i<n; i++)
            System.out.print(indegree[i]+" "); 


        //topological sort starts..
        Queue<Integer> q= new LinkedList<>(); 
        for(int i=0;i<n; i++){
            if(indegree[i]==0)
                q.add(i); 
        }

        int[] topo = new int[n]; 
        int ind=0; 

        while(!q.isEmpty()){
            int node= q.poll(); // [2] 
            topo[ind++]= node; 

            for(int j: adj.get(node)){
                indegree[j]--; 

                if(indegree[j]==0)
                    q.add(j); 
            }
        }

        return ind==n; 
        
    }
}