class Solution {
    public boolean canFinish(int n, int[][] pre) {

        // This is BFS Based Topological Sort, so using Queue
   
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // filling the adjacency list -- Each course has a list of prereq courses that depend on it...

        for (int i = 0; i < pre.length; i++) {
            //pre[i][0] : course
            // pre[i][1] : prerequisite
            adj.get(pre[i][0]).add(pre[i][1]);
        }



        int indegree[] = new int[n]; //  number of prereq for course i

        // for loop iterates over each course (i) and its dependent courses (j)
        for (int i = 0; i < n; i++) {
            for (int j : adj.get(i)) {
                indegree[j]++; // j depends on course i
            }
        }

        // Topological Sort starts from here..


        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {    
                // indegree= 0 means no prereq, can be taken immediately
                q.add(i);
            }
        }


        int topo[] = new int[n];
        int ind = 0;

        while (!q.isEmpty()) {
            int node = q.remove();
            topo[ind++] = node;
           
            for (int j : adj.get(node)) {
                indegree[j]--;
                if (indegree[j] == 0) // indegree= 0 means no prereq, can be taken immediately
                    q.add(j);
            }
        }
    return ind==n;
        
    }
}