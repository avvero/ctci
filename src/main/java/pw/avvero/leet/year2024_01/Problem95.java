package pw.avvero.leet.year2024_01;

import java.util.ArrayList;
import java.util.List;

public class Problem95 {

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

        @Override
        public String toString() {
            if (left == null && right == null) {
                return "" + val;
            } else {
                return "[" + val + ", " + left +", " + right +']';
            }
        }
    }

    // 1     2
    //  \   /   x 3
    //   2 1
    // 2     3
    //  \   /   x 1
    //   3 2
    // 0, 1, 2 ,3
    // 1, 1, 2, 5


    public List<TreeNode> generateTrees(int n) {
        List[] dp = new List[n + 1];
        dp[0] = List.of();
        dp[1] = List.of(new TreeNode(1));
        for (int i = 2; i <= n; i++) {
            dp[i] = new ArrayList<>();
            for (int j = 1; j < i; j++) {
                dp[i].addAll(multiply(dp[i - j], dp[j - 1]));
            }
            List<TreeNode> left = multiply(dp[i], List.of(new TreeNode(i)));
            List<TreeNode> right = multiply(List.of(new TreeNode(i)), dp[i]);
            dp[i] = new ArrayList();
            dp[i].addAll(left);
            dp[i].addAll(right);
        }
        return dp[n];
    }

    private List<TreeNode> multiply(List<TreeNode> as, List<TreeNode> bs) {
        if (as.size() == 0) return bs;
        if (bs.size() == 0) return as;

        List<TreeNode> nodes = new ArrayList<>();
        for (TreeNode a : as) {
            for (TreeNode b : bs) {
                nodes.add(populate(clone(a), clone(b)));
            }
        }
        return nodes;
    }

    private TreeNode populate(TreeNode a, TreeNode b) {
        if (a == null) return b;
        if (a.val > b.val) {
            a.left = populate(a.left, b);
        } else {
            a.right = populate(a.right, b);
        }
        return a;
    }

    private TreeNode clone(TreeNode node) {
        if (node == null) return null;
        TreeNode result = new TreeNode(node.val);
        result.left = clone(node.left);
        result.right = clone(node.right);
        return result;
    }
}
