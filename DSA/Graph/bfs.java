/*
Problem: Breadth First Search (BFS)
Platform: Standard
Time Complexity: O(V+E)
Space Complexity: O(V)
*/

import java.util.*;

public class BFS {
    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
