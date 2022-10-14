package pw.avvero.ctci.chapter4;

public class NextFinder {
    public static <T extends Comparable<T>> T next(BinaryTree<T> tree, T current) {
        BinaryTree.Node<T> node = find(tree.root, current);
        if (node == null) return null;
        if (node.right != null) return leftest(node.right);
        if (node.parent == null) return null;
        return findParent(current, node);
    }

    private static <T extends Comparable<T>> T leftest(BinaryTree.Node<T> node) {
        return node.left == null ? node.value : leftest(node.left);
    }

    private static <T extends Comparable<T>> T findParent(T current, BinaryTree.Node<T> node) {
        while (node.parent != null) {
            if (node.parent.value.compareTo(current) > 0) return node.parent.value;
            node = node.parent;
        }
        return null;
    }

    private static <T extends Comparable<T>> BinaryTree.Node<T> find(BinaryTree.Node<T> node, T current) {
        if (node == null) return null;
        if (node.value.compareTo(current) == 0) return node;
        if (node.value.compareTo(current) > 0) return find(node.left, current);
        return find(node.right, current);
    }
}
