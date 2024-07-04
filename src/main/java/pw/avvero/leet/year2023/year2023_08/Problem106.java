package pw.avvero.leet.year2023.year2023_08;

import java.util.Arrays;

public class Problem106 {


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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        if (inorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        int rootVali = 0;
        for (; rootVali < inorder.length; rootVali++) {
            if (rootVal == inorder[rootVali]) break;
        }
        if (rootVali > 0) {
            int[] inorderLeft = Arrays.copyOfRange(inorder, 0, rootVali);
            int[] postorderLeft = Arrays.copyOfRange(postorder, 0, rootVali);
            root.left = buildTree(inorderLeft, postorderLeft);
        }
        if (rootVali < inorder.length - 1) {
            int[] inorderRight = Arrays.copyOfRange(inorder, rootVali + 1, inorder.length);
            int[] postorderRight = Arrays.copyOfRange(postorder, rootVali, postorder.length - 1);
            root.right = buildTree(inorderRight, postorderRight);
        }
        return root;
    }

}
