package pw.avvero.leet.year2023_08;

public class Problem124 {


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

    public int maxPathSum(TreeNode root) {
        int[] result = new int[]{Integer.MIN_VALUE};
        maxPathSum(root, result);
        return result[0];
    }

    public int maxPathSum(TreeNode root, int[] result) {
        if (root == null) return 0;
        int leftVal = 0;
        int rightVal = 0;
        leftVal = maxPathSum(root.left);
        rightVal = maxPathSum(root.right);
        int val = Math.max(root.val + leftVal, root.val + rightVal);
        val = Math.max(val, root.val + leftVal + rightVal);
        val = Math.max(val, root.val);
        result[0] = Math.max(result[0], val);
        return val;
    }

}
