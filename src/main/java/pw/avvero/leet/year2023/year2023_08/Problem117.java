package pw.avvero.leet.year2023.year2023_08;

import java.util.Arrays;
import java.util.LinkedList;

public class Problem117 {


    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        LinkedList<Node> nodes = new LinkedList();
        nodes.add(root);
        return root;
    }

    private void connect(LinkedList<Node> roots) {
        LinkedList<Node> nodes = new LinkedList();
        Node prev = null;
        for (Node root : roots) {
            if (root.left != null) {
                nodes.add(root.left);
            }
            if (root.right != null) {
                nodes.add(root.right);
            }
            if (prev != null) {
                prev.next = root;
            }
            prev = root;
        }
        connect(nodes);
    }

}
