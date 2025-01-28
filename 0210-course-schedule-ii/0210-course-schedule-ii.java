class Solution {
    public int[] findOrder(int n, int[][] prereq) {

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
        int ind = 0;

        while (!q.isEmpty()) {
            int node = q.poll(); // [2]
            topo[ind++] = node;

            for (int j : adj.get(node)) {
                indegree[j]--;

                if (indegree[j] == 0)
                    q.add(j);
            }
        }

        if (ind < n)
            return new int[0]; // Cycle detected



        // Temporary array to store elements in reversed order
        int[] temp = new int[topo.length];
  
        // Copy elements from original array to temp in reverse order
        for (int i = 0; i < topo.length; i++)
            temp[i] = topo[topo.length - i - 1];
  
        // Copy elements back to original array
        for (int i = 0; i < topo.length; i++)
            topo[i] = temp[i];

        return topo;

    }
}
