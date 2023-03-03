package pw.avvero.leet.year2022;

public class Problem105 {

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        if (preorder.length == 1) return new TreeNode(preorder[0]);
        return buildTree(preorder, inorder, new int[]{0}, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int[] p, int is, int ie) {
        if (is < 0 || is > ie) return null;
        if (ie < 0 || ie >= preorder.length) return null;
        if (p[0] >= preorder.length) return null;

        int val = preorder[p[0]++];
        TreeNode node = new TreeNode(val);
        for (int i = is; i <= ie; i++) {
            if (inorder[i] == val) {
                node.left = buildTree(preorder, inorder, p, is, i - 1);
                node.right = buildTree(preorder, inorder, p, i + 1, ie);
                break;
            }
        }
        return node;
    }
}
