package pw.avvero.ctci.chapter4;

import java.util.HashSet;
import java.util.Set;

public class GraphBreadthWalker<T> {

    Set<T> passed = new HashSet<>();

    public boolean pathExists(Graph<T> graph, T start, T end) {
        if (start == null || end == null) return false;
        if (start.equals(end)) return true;

        passed.add(start);

        Graph.Vertex<T> vertex = getVertex(graph, start);
        if (vertex == null) return false;

        for (T node : vertex.nodes) {
            if (passed.contains(node)) return false;
            boolean pathExists = pathExists(graph, node, end);
            if (pathExists) return true;
        }
        return false;
    }

    private Graph.Vertex<T> getVertex(Graph<T> graph, T value) {
        if (value == null) return null;
        for (Graph.Vertex<T> vertex : graph.vertices) {
            if (value.equals(vertex.value)) return vertex;
        }
        return null;
    }
}
