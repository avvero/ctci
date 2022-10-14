package pw.avvero.ctci.chapter4;

public class BinaryTree<T extends Comparable<T>> {

    Node<T> root;

    public static class Node<T extends Comparable<T>> {
        Node<T> left;
        T value;
        Node<T> right;
        Node<T> parent;

        public Node(T value) {
            this.value = value;
        }

        public Node(Node<T> left, T value, Node<T> right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }

        @Override
        public String toString() {
            return "[" + (left != null ? left : "_") + ", "
                    + (value != null ? value : "_") + ", "
                    + (right != null ? right : "_") + ']';
        }

        public StringBuilder prettyPrint(StringBuilder prefix, boolean isTail, StringBuilder sb) {
            if (right != null) {
                right.prettyPrint(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
            }
            sb.append(prefix).append(isTail ? "└── " : "┌── ").append(value.toString()).append("\n");
            if (left != null) {
                left.prettyPrint(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
            }
            return sb;
        }
    }

    public static <T extends Comparable<T>> BinaryTree<T> of(T... values) {
        BinaryTree<T> tree = new BinaryTree<>();
        for (T node : values) {
            tree.add(node);
        }
        return tree;
    }

    public static <T extends Comparable<T>> BinaryTree<T> of(Node<T> node) {
        BinaryTree<T> tree = new BinaryTree<>();
        tree.root = node;
        return tree;
    }

    public void add(T t) {
        if (root == null) {
            root = new Node<>(t);
            return;
        }
        add(root, t);
    }

    private void add(Node<T> root, T t) {
        int c = t.compareTo(root.value);
        if (c == 0) {
            return; // the same
        } else if (c < 0) {
            if (root.left != null) {
                add(root.left, t);
            } else {
                root.left = new Node<>(t);
            }
        } else {
            if (root.right != null) {
                add(root.right, t);
            } else {
                root.right = new Node<>(t);
            }
        }
    }

    @Override
    public String toString() {
        return root.toString();
    }

    public String prettyPrint() {
        return root.prettyPrint(new StringBuilder(), true, new StringBuilder()).toString();
    }
}
