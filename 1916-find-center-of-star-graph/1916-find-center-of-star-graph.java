import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1; // Number of nodes

        List<Integer>[] graph = new ArrayList[n + 1]; //  1-based indexing
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // adjacency list
        for (int[] e : edges) {
            int v1 = e[0];
            int v2 = e[1];

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

       
        for (int i = 1; i <= n; i++) { // Start from 1 to n (inclusive)
            if (graph[i].size() == n - 1) {
                return i;
            }
        }

        return -1; 
    }
}
