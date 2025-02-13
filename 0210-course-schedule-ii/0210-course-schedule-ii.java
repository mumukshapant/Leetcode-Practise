class Solution {
    public int[] findOrder(int n, int[][] prereq) {

        //same as Course Scheduling, except topo is being populated in reverse order

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] p : prereq) {
            int course = p[0]; // course
            int prerequisite = p[1];

            adj.get(course).add(prerequisite);
        }

        int[] indegree = new int[n];

        // given : courses - labeled from 0 to numCourses - 1.

        for (int i = 0; i < n; i++) {
            for (int j : adj.get(i)) {
                indegree[j]++;

            }
        }

        // topological sort starts..
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

       int[] topo = new int[n];
        int ind = n - 1; // Start filling topo from the last index

        while (!q.isEmpty()) {
            int node = q.poll();
            topo[ind--] = node; // Populate topo array in reverse order

            for (int j : adj.get(node)) {
                indegree[j]--;

                if (indegree[j] == 0) {
                    q.add(j);
                }
            }
        }

        
        if (ind != -1) {
            return new int[0]; // Cycle detected
        }

        return topo;

    }
}
