package pw.avvero.ctci.chapter4;

public class BinarySearchChecker {
    public static <T extends Comparable<T>> boolean check(BinaryTree<T> tree) {
        return check(tree.root);
    }

    private static <T extends Comparable<T>> boolean check(BinaryTree.Node<T> root) {
        if (root.left != null) {
            if (root.left.value.compareTo(root.value) >= 0) return false;
            if (!check(root.left)) return false;
        }
        if (root.right != null) {
            if (root.right.value.compareTo(root.value) <= 0) return false;
            if (!check(root.right)) return false;
        }
        return true;
    }
}
