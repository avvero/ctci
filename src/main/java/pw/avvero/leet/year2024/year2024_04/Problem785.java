package pw.avvero.leet.year2024.year2024_04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem785 {

    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, HashSet<Integer>> edges = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                edges.computeIfAbsent(i, k -> new HashSet<Integer>()).add(graph[i][j]);
            }
        }
        HashMap<Integer, Integer> markers = new HashMap<>();
        boolean[] result = {true};
        traverse(edges, 0, 0, markers, result);
        return result[0];
    }

    private void traverse(HashMap<Integer, HashSet<Integer>> edges, int a, int marker,
                          HashMap<Integer, Integer> markers, boolean[] result) {
        if (!result[0]) return;
        if (markers.get(a) != null) {
            if (markers.get(a) != marker) {
                result[0] = false;
            }
            return; // visited, do not traverse
        }
        markers.put(a, marker);
        int nextMarker = marker == 0 ? 1 : 0;
        if (edges.get(a) == null) return;
        for (Integer next: edges.get(a)) {
            traverse(edges, next, nextMarker, markers, result);
        }
    }

}
