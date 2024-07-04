package pw.avvero.leet.year2023.year2023_05;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Problem297 {

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
            if (root == null) return "[]";
            ArrayList<Integer> entries = new ArrayList<>();
            ArrayList<TreeNode> buffer = new ArrayList<>();
            buffer.add(root);
            while (buffer.size() > 0) {
                TreeNode node = buffer.get(0);
                buffer.remove(0);
                if (node != null) {
                    entries.add(node.val);
                    buffer.add(node.left);
                    buffer.add(node.right);
                } else {
                    entries.add(null);
                }
            }
            // trim tail
            while(entries.get(entries.size() - 1) == null) {
                entries.remove(entries.size() - 1);
            }
            return writeValue(entries);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            ArrayList<Integer> entries = parse(data);
            if (entries.size() == 0) return null;
            ArrayList<TreeNode> buffer = new ArrayList<>();
            TreeNode root = new TreeNode(entries.get(0));
            buffer.add(root);
            fill(buffer, entries, 1);
            return root;
        }

        private void fill(ArrayList<TreeNode> buffer, ArrayList<Integer> entries, int e) {
            while (buffer.size() > 0) {
                TreeNode root = buffer.get(0);
                buffer.remove(0);
                if (e < entries.size() && entries.get(e) != null) {
                    TreeNode node = new TreeNode(entries.get(e));
                    root.left = node;
                    buffer.add(node);
                }
                e++;
                if (e < entries.size() && entries.get(e) != null) {
                    TreeNode node = new TreeNode(entries.get(e));
                    root.right = node;
                    buffer.add(node);
                }
                e++;
            }
        }

        private ArrayList<Integer> parse(String data) {
            if (data.length() == 2) return new ArrayList<>();
            ArrayList<Integer> entries = new ArrayList<>();
            char[] chars = data.toCharArray();
            int num = Integer.MIN_VALUE;
            int sign = 1;
            for (int i = 1; i < chars.length; i++) {
                char chr = chars[i];
                if (chr == ',' || chr == ']') {
                    if (num > Integer.MIN_VALUE) {
                        entries.add(sign * num);
                        num = Integer.MIN_VALUE;
                        sign = 1;
                    } else {
                        entries.add(null);
                    }
                } else if (chr == '-') {
                    sign = -1;
                } else if (chr >= '0' && chr <= '9') {
                    if (num == Integer.MIN_VALUE) {
                        num = 0;
                    }
                    num = num * 10 + chr - '0';
                }
            }
            return entries;
        }

        private String writeValue(ArrayList<Integer> entries) {
            return entries.stream().map(e -> e != null ? e.toString() : "null").collect(Collectors.joining(",", "[", "]"));
        }
    }
}
