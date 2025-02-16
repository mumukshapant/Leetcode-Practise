class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {

        // course , pre 

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n; i++)
            adj.add(new ArrayList<>() ); 

        int[] indegree = new int[n]; 

        for(int[] p: prerequisites){
            int course= p[0]; 
            int pre = p[1];
            adj.get(course).add(pre); 
        }
        //indegree will contains only prerequisite


        // indegree [0] = 1
        // indegree[1] = 0 
        
        for(int i=0;i<n;i++){
            for(int j: adj.get(i))
                indegree[j]++; 
            
        }
        
        Queue<Integer> q = new LinkedList<>(); //stores pre 
        
        for(int i=0;i<n ; i++){
            if(indegree[i]==0) //no prereq
            {
                q.add(i); 
            }
        }
        int[] topo = new int[n]; 
        int index=0; 


        while(!q.isEmpty()){
            
            int node = q.poll();   //      [ 0 ]
            topo[index ++] = node; 

            for(int j: adj.get(node)){
                indegree[j]--; 
                
                if(indegree[j]==0)
                    q.add(j); 
            }

        }
        

        /**
                course. Pre
        // adj : [ 1 -> 0  ]
                 [ 0 -> 1  ]




         */
         return index==n; 
        
    }
}