package pw.avvero.leet;

public class Problem98 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root.left != null && root.left.val >= root.val) return false;
        if (root.right != null && root.right.val <= root.val) return false;

        if (root.left != null && min != null && root.left.val <= min) return false;
        if (root.left != null && max != null && root.left.val >= max) return false;

        if (root.right != null && min != null && root.right.val <= min) return false;
        if (root.right != null && max != null && root.right.val >= max) return false;

        if (root.left != null) {
            boolean left = isValidBST(root.left, min(root.val, min), max(root.val, min));
            if (!left) return false;
        }
        if (root.right != null) {
            boolean right = isValidBST(root.right, min(root.val, max), max(root.val, max));
            if (!right) return false;
        }
        return true;
    }

    private Integer min(Integer a, Integer b) {
        if (a == null) return a;
        if (b == null) return b;
        return Math.min(a, b);
    }

    private Integer max(Integer a, Integer b) {
        if (a == null) return a;
        if (b == null) return b;
        return Math.max(a, b);
    }
}
