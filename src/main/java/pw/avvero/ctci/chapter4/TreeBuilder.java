package pw.avvero.ctci.chapter4;

import java.util.List;

public class TreeBuilder {

    public static <T extends Comparable<T>> BinaryTree<T> fromOrderedList(List<T> values) {
        BinaryTree<T> tree = new BinaryTree<>();
        for (T node : values) {
            tree.add(node);
        }
        return tree;
    }

}
