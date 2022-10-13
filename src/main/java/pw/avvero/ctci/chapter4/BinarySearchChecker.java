package pw.avvero.ctci.chapter4;

public class BinarySearchChecker {
    public static boolean check(BinaryTree<Integer> tree) {
        return check(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean check(BinaryTree.Node<Integer> root, Integer min, Integer max) {
        if (root.value < min || root.value > max) return false;
        if (root.left != null) {
            if (root.left.value.compareTo(root.value) >= 0) return false;
            if (!check(root.left, min, root.value)) return false;
        }
        if (root.right != null) {
            if (root.right.value.compareTo(root.value) <= 0) return false;
            if (!check(root.right, root.value, max)) return false;
        }
        return true;
    }
}
