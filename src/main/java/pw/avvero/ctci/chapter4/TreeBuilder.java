package pw.avvero.ctci.chapter4;

import pw.avvero.ctci.chapter4.BinaryTree.Node;

public class TreeBuilder {

    public static <T extends Comparable<T>> BinaryTree<T> fromOrderedList(T[] values) {
        BinaryTree<T> tree = new BinaryTree<>();
        tree.root = getNodes(values, 0, values.length - 1);
        return tree;
    }

    private static <T extends Comparable<T>> Node<T> getNodes(T[] values, int start, int end) {
        int pivot = start + (end - start) / 2;
        if (pivot < 0) return null;
        Node<T> root = new Node<T>(values[pivot]);
        if (start < pivot) {
            root.left = getNodes(values, start, pivot - 1);
        }
        if (pivot < end) {
            root.right = getNodes(values, pivot + 1, end);
        }
        return root;
    }

}
