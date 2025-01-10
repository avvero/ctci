package pw.avvero.leet.year2024.year2024_01;

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
        return subTrees(1, n);
    }
    private List<TreeNode> subTrees(int start, int end){
        List<TreeNode> res = new ArrayList();
        if(start>end) {
            res.add(null);
            return res;
        }
        for(int i=start; i<=end; i++){
            List<TreeNode> left = subTrees(start, i-1);
            List<TreeNode> right = subTrees(i+1, end);
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
