package pw.avvero.leet.year2026_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem677 {

    class Node {
        int val = 0;
        Node[] nodes = new Node[32];
    }

    Node root = new Node();

    public Problem677() {

    }

    public void insert(String key, int val) {
        Node node = root;
        for (char c : key.toCharArray()) {
            int k = key(c);
            if (node.nodes[k] == null) {
                node.nodes[k] = new Node();
            }
            node = node.nodes[k];
        }
        node.val = val;
    }

    public int sum(String prefix) {
        Node node = root;
        for (char c : prefix.toCharArray()) {
            int k = key(c);
            if (node.nodes[k] != null) {
                node = node.nodes[k];
            } else {
                node = null;
                break;
            }
        }
        return sum(node);
    }

    private int sum(Node node) {
        if (node == null) return 0;
        int sum = node.val;
        for (Node sub : node.nodes) {
            sum += sum(sub);
        }
        return sum;
    }

    private int key(char c) {
        return c - 'a';
    }
}
