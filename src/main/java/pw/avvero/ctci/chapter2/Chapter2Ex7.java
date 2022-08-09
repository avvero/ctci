package pw.avvero.ctci.chapter2;

public class Chapter2Ex7 {

    public static <T> boolean isPalindrome(Node<T> head) {
        return compare(head, head).equals;
    }

    private static <T> Pair<T> compare(Node<T> current, Node<T> head) {
        if (current.next == null) {
            if (current.value.equals(head.value)) {
                return Pair.of(head.next, true);
            } else {
                return Pair.of(null, false);
            }
        } else {
            Pair<T> pair = compare(current.next, head);
            if (pair.node == null) return pair;
            if (current.value.equals(pair.node.value)) {
                return Pair.of(pair.node.next, true);
            } else {
                return Pair.of(null, false);
            }
        }
    }

    private static class Pair<T> {
        Node<T> node;
        boolean equals;

        public static <T> Pair<T> of(Node<T> node, boolean equals) {
            Pair<T> pair = new Pair<>();
            pair.node = node;
            pair.equals = equals;
            return pair;
        }
    }
}
