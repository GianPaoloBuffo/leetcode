package other.dfsOfGraph;

import java.util.ArrayList;
import java.util.List;

public class DfsOfGraph {

    // Time Complexity: O(V + E)
    // Space Complexity: O(V)
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        var visited = new boolean[V];
        var result = new ArrayList<Integer>();

        dfs(0, adj, visited, result);

        return result;
    }

    private static void dfs(int vertex, List<List<Integer>> adj, boolean[] visited, List<Integer> result) {
        visited[vertex] = true;
        result.add(vertex);

        for (var neighbour : adj.get(vertex)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, result);
            }
        }
    }
}
