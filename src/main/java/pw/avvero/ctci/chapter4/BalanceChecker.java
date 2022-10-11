package pw.avvero.ctci.chapter4;

import static pw.avvero.ctci.chapter4.BinaryTree.Node;

public class BalanceChecker {

    public static boolean isBalanced(BinaryTree tree) {
        try {
            height(tree.root);
        } catch (RuntimeException re) {
            return false;
        }
        return true;
    }

    public static int height(Node node) {
        if (node == null) return 0;

        int lh = height(node.left) + 1;
        int rh = height(node.right) + 1;

        if (Math.abs(lh - rh) > 1) throw new RuntimeException();

        return Math.max(lh, rh);
    }

}
