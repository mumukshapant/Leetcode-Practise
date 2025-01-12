class Solution {
    public boolean canFinish(int n, int[][] pre) {

        int[] indegree = new int[n];
        Map<Integer, List<Integer>> neighbours = new HashMap<>();

        for (int i = 0; i < n; i++) {
            neighbours.put(i, new ArrayList<>());
        }

        for (int[] p : pre) {
            int course = p[0];
            int prerequisite = p[1];
            indegree[course]++;
            neighbours.get(prerequisite).add(course);
        }

         Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int exploredNodes = 0;
        
        // Perform BFS
        while (!q.isEmpty()) {
            int currNode = q.poll();
            exploredNodes++;
            
            for (int neighbour : neighbours.get(currNode)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    q.offer(neighbour);
                }
            }
        }
        
        return exploredNodes == n;
        
    }
}