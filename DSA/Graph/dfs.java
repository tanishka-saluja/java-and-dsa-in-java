/*
Problem: Depth First Search (DFS)
Platform: Standard
Time Complexity: O(V+E)
Space Complexity: O(V)
*/

import java.util.*;

public class DFS {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}
