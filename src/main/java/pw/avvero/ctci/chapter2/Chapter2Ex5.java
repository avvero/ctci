package pw.avvero.ctci.chapter2;

public class Chapter2Ex5 {

    public static Node<Integer> sumReversed(Node<Integer> a, Node<Integer> b, Integer high) {
        Integer sumValue = high / 10 + a.getValue() + b.getValue();
        Integer low = sumValue % 10;
        Node<Integer> current = Node.of(low);
        if (a.getNext() != null || b.getNext() != null) {
            Node<Integer> nextA = a.getNext() != null ? a.getNext() : Node.of(0);
            Node<Integer> nextB = b.getNext() != null ? b.getNext() : Node.of(0);
            current.setNext(sumReversed(nextA, nextB, sumValue - low));
        }
        return current;
    }

    public static Node<Integer> sum(Node<Integer> a, Node<Integer> b) {
        int aLength = length(a);
        int bLength = length(b);
        if (aLength > bLength) {
            b = inline(b, bLength, aLength);
        } else {
            a = inline(a, aLength, bLength);
        }
        return sumInlined(a, b).node;
    }

    private static Pair sumInlined(Node<Integer> a, Node<Integer> b) {
        if (a.getNext() == null) {
            int value = a.getValue() + b.getValue();
            int lowDigit = value % 10;
            Node<Integer> node = Node.of(lowDigit);
            return Pair.of(node, (value - lowDigit) / 10);
        } else {
            Pair next = sumInlined(a.getNext(), b.getNext());
            int value = a.getValue() + b.getValue() + next.highDigit;
            int lowDigit = value % 10;
            Node<Integer> node = Node.of(lowDigit);
            node.setNext(next.node);
            return Pair.of(node, (value - lowDigit) / 10);
        }
    }

    private static class Pair {
        private Node<Integer> node;
        private int highDigit;
        private static Pair of(Node<Integer> node, int highDigit) {
            Pair pair = new Pair();
            pair.node = node;
            pair.highDigit = highDigit;
            return pair;
        }
    }

    private static int length(Node<Integer> list) {
        int l = list != null ? 1 : 0;
        while (list != null && list.getNext() != null) {
            l++;
            list = list.getNext();
        }
        return l;
    }

    private static Node<Integer> inline(Node<Integer> list, int length, int targetLength) {
        Node<Integer> result = list;
        for (int i = 0; i < (targetLength - length); i++) {
            Node<Integer> head = Node.of(0);
            head.setNext(result);
            result = head;
        }
        return result;
    }
}
