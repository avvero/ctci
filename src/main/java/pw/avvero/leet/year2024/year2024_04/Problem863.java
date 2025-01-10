package pw.avvero.leet.year2024.year2024_04;

import java.util.*;

public class Problem863 {

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

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, TreeNode> parents = new HashMap<>();
        dfs(parents, root, null);
        LinkedList<Object[]> tovisit = new LinkedList<>();
        tovisit.add(new Object[]{target, 0});
        while(!tovisit.isEmpty()) {
            Object[] entry = tovisit.removeFirst();
            TreeNode node = (TreeNode) entry[0];
            Integer distance = (Integer) entry[1];
            if (distance == k) {
                result.add(node.val);
            }
            if (distance > k) continue;
            addNext(tovisit, parents.get(node.val), distance + 1);
            addNext(tovisit, node.left, distance + 1);
            addNext(tovisit, node.right, distance + 1);
        }
        return result;
    }

    private void addNext(LinkedList<Object[]> tovisit, TreeNode node, Integer distance) {
        if (node == null) return;
        tovisit.add(new Object[]{node, distance});
    }

    private void dfs(Map<Integer, TreeNode> parents, TreeNode node, TreeNode parent) {
        if (node == null) return;
        parents.put(node.val, parent);
        dfs(parents, node.left, node);
        dfs(parents, node.right, node);
    }

}
