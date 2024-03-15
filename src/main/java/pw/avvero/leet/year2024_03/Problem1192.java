package pw.avvero.leet.year2024_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1192 {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        int[][] path = new int[n][n];
        List<Integer>[] links = link(n, connections);
        traverse(links, 0, new HashSet<String>(), path);
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> connection : connections) {
            int m = path[connection.get(0)][connection.get(1)] + path[connection.get(1)][connection.get(0)];
            if (m == 2) {
                result.add(connection);
            }
        }
        return result;
    }

    private void traverse(List<Integer>[] links, int root, Set<String> trace, int[][] path) {
        for (Integer node : links[root]) {
            if (trace.contains(root + "_" + node) || trace.contains(node + "_" + root)) continue;
            trace.add(root + "_" + node);
            trace.add(node + "_" + root);
            path[root][node]++;
            traverse(links, node, new HashSet(trace), path);
        }
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
