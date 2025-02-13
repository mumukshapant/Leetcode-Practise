class Solution {
    public boolean canFinish(int n, int[][] prereq) {


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int[] p: prereq){

            int course= p[0];  //1
            int pre = p[1]; // 0 
            adj.get(course).add(pre); 
        }
        int[] indegree= new int[n]; //for prerequisite

        for(int i=0;i<n; i++){
            for(int j: adj.get(i)){
                indegree[j]++; 

            } 
        }


        Queue<Integer> q= new LinkedList<>(); //stores prerequisties
        for(int i=0;i<n ; i++){
            if(indegree[i]==0)//means no prerequisite
                q.add(i); 
        }

        int index=0; 
        int[] topo = new int[n]; 

         
        while(!q.isEmpty()){

            int node= q.poll(); // [ 0 ]
            topo[index++ ]= node; 

            for(int j: adj.get(node)){ //prerequisite
                indegree[j]--; 
                if(indegree[j]==0)
                    q.add(j); 



            }

        }

        return index==n; 

        
    }
}