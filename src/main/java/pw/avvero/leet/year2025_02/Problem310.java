package pw.avvero.leet.year2025_02;

import java.util.*;

public class Problem310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], k -> new HashSet<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new HashSet<>()).add(edge[0]);
        }
        TreeMap<Integer, List<Integer>> heights = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            HashSet<Integer> path = new HashSet<>();
            int height = traverse(i, map, path, 1);
            heights.computeIfAbsent(height, k -> new ArrayList<>()).add(i);
        }
        return heights.firstEntry().getValue();
    }

    private int traverse(int node, HashMap<Integer, HashSet<Integer>> map, HashSet<Integer> path, int height) {
        path.add(node);
        HashSet<Integer> nextNodes = map.get(node);
        if (nextNodes != null) {
            for (Integer nextNode: nextNodes) {
                if (path.contains(nextNode)) continue;
                int nextNodeHeight = traverse(nextNode, map, path, height + 1);
                height = Math.max(height, nextNodeHeight);
            }
        }
        return height;
    }
}
