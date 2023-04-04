package pw.avvero.leet.year2023_03;

public class Problem236 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private class Node {
        TreeNode treeNode;
        Node next;

        Node(TreeNode treeNode, Node next) {
            this.treeNode = treeNode;
            this.next = next;
        }
    }

    private class Result {
        Node p;
        Node q;

        Result(Node p, Node q) {
            this.p = p;
            this.q = q;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Result result = new Result(null, null);
        Node pNode = new Node(null, null);
        Node qNode = new Node(null, null);
        lowestCommonAncestor(root, p, pNode, q, qNode, result);
        while (pNode.next != null || qNode.next != null) {
            if (pNode.next.treeNode.val != qNode.next.treeNode.val) {
                return pNode.treeNode;
            }
            pNode = pNode.next;
            qNode = qNode.next;
        }
        return null;
    }

    private void lowestCommonAncestor(TreeNode root, TreeNode p, Node pNode, TreeNode q, Node qNode, Result result) {
        if (result.p != null && result.q != null) return;
        if (root == null) return;
        if (result.p == null) {
            pNode.next = new Node(root, null);
        }
        if (result.q == null) {
            qNode.next = new Node(root, null);
        }
        lowestCommonAncestor(root.left, p, pNode.next, q, qNode.next, result);
        lowestCommonAncestor(root.right, p, pNode.next, q, qNode.next, result);
        if (root.val == p.val) {
            result.p = pNode.next;
            //result.p.next = null;
        }
        if (root.val == q.val) {
            result.q = qNode.next;
            //result.p.next = null;
        }
    }
}
