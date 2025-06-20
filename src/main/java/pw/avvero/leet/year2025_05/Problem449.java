package pw.avvero.leet.year2025_05;

public class Problem449 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return null;
            String value = "" + root.val;
            String left = serialize(root.left);
            if (left != null) {
                value = left + "," + value;
            }
            String right = serialize(root.right);
            if (right != null) {
                value = value + "," + right;
            }
            return value;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null) return null;

            String[] array = data.split(",");
            int[] values = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                values[i] = Integer.valueOf(array[i]);
            }
            return build(values, 0, values.length - 1);
        }

        private TreeNode build(int[] values, int s, int e) {
            if (s > e) return null;
            int m = s + (e - s) / 2;
            TreeNode node = new TreeNode(values[m]);
            node.left = build(values, s, m - 1);
            node.right = build(values, m + 1, e);
            return node;
        }
    }
}
