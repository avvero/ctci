package pw.avvero.leet.year2024_03;

import java.util.*;

public class Problem1192 {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[] visited = new int[n];
        int[] low = new int[n];
        int[] desc = new int[n];
        int id = 0;
        List<Integer>[] links = link(n, connections);
        List<List<Integer>> result = new ArrayList<>();
        traverse(links, 0, -1, id, visited, low, desc, result);
        return result;
    }

    private int traverse(List<Integer>[] links,
                         int root,
                         int parent,
                         int id,
                         int[] visited,
                         int[] low,
                         int[] desc,
                         List<List<Integer>> result) {
        if (visited[root] == 1) return low[root];
        visited[root] = 1;
        desc[root] = id;
        low[root] = id;
        for (Integer link : links[root]) {
            if (link == parent) continue;
            low[root] = Math.min(low[root], traverse(links, link, root, ++id, visited, low, desc, result));
            if (low[link] > desc[root]) {
                result.add(List.of(root, link));
            }
        }
        return low[root];
    }

    private List<Integer>[] link(int n, List<List<Integer>> connections) {
        List<Integer>[] links = new List[n];
        for (int i = 0; i < n; i++) {
            links[i] = new ArrayList<>();
        }
        for (List<Integer> connection : connections) {
            links[connection.get(0)].add(connection.get(1));
            links[connection.get(1)].add(connection.get(0));
        }
        return links;
    }

}
