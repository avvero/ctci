package pw.avvero.ctci.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {

    public static class Vertex<T> {
        T value;
        List<T> nodes = new ArrayList<>();
    }

    List<Vertex<T>> vertices = new ArrayList<>();

}
