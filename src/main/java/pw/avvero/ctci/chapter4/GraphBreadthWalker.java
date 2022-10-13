package pw.avvero.ctci.chapter4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GraphBreadthWalker<T> {

    Set<T> passed = new HashSet<>();

    public boolean pathExists(Graph<T> graph, T start, T end) {
        if (start == null || end == null) return false;
        if (start.equals(end)) return true;

        LinkedList<T> queue = new LinkedList<T>();
        queue.add(start);

        while (queue.peek() != null) {
            T current = queue.poll();

            if (passed.contains(current)) return false;
            passed.add(current);

            if (current.equals(end)) return true;

            Graph.Vertex<T> vertex = getVertex(graph, current);
            if (vertex == null) return false;
            queue.addAll(vertex.nodes);
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
