package pw.avvero.ctci.chapter4;

import pw.avvero.ctci.chapter4.BinaryTree.Node;

public class SubtreeChecker {
    public static <T extends Comparable<T>> boolean isSubTree(BinaryTree<T> tree, BinaryTree<T> subTree) {
        Node<T> node = findNode(tree.root, subTree.root);
        return compare(node, subTree.root);
    }

    private static <T extends Comparable<T>> boolean compare(Node<T> first, Node<T> second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        if (first.value.compareTo(second.value) != 0) return false;
        return compare(first.left, second.left) && compare(first.right, second.right);
    }

    private static <T extends Comparable<T>> Node<T> findNode(Node<T> node, Node<T> target) {
        if (node == null) return null;
        if (node.value.compareTo(target.value) == 0) return node;
        if (node.left != null) {
            Node<T> left = findNode(node.left, target);
            if (left != null) {
                return left;
            }
        }
        if (node.right != null) {
            Node<T> right = findNode(node.right, target);
            if (right != null) {
                return right;
            }
        }
        return null;
    }
}
