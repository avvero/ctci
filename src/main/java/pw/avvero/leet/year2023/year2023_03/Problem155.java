package pw.avvero.leet.year2023.year2023_03;

public class Problem155 {

    static class MinStack {

        private class Node {
            private int val;
            private int min;
            private Node next;
            public Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }

        private Node root;

        public MinStack() {
        }

        public void push(int val) {
            int min = root != null ? Math.min(root.val, val) : val;
            root = new Node(val, min, root);
        }

        public void pop() {
            root = root.next;
        }

        public int top() {
            return root.val;
        }

        public int getMin() {
            return root.min;
        }
    }


}
