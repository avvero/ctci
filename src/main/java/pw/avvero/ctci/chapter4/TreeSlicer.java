package pw.avvero.ctci.chapter4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TreeSlicer {

    public static <T extends Comparable<T>> Map<Integer, LinkedList<T>> getLayers(BinaryTree<T> tree) {
        HashMap<Integer, LinkedList<T>> layers = new HashMap<>();
        slice(layers, 0, tree.root);
        return layers;
    }

    private static <T extends Comparable<T>> void slice(HashMap<Integer, LinkedList<T>> layers,
                                                        int level,
                                                        BinaryTree.Node<T> root) {
        if (root == null) return;
        layers.computeIfAbsent(level, k -> new LinkedList<>()).add(root.value);
        slice(layers, level + 1, root.left);
        slice(layers, level + 1, root.right);
    }

}
