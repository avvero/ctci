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
        if (a.getNext() != null || b.getNext() != null) {
            Node<Integer> nextA = a.getNext();
            Node<Integer> nextB = b.getNext();
            if (a.getNext() == null) {
                nextA = a;
                a = Node.of(0);
            }
            if (b.getNext() == null) {
                nextB = b;
                b = Node.of(0);
            }

            Node<Integer> next = sum(nextA, nextB);
            Integer nextValue = next.getValue();
            Integer high = 0;
            if (nextValue >= 10) {
                Integer low = nextValue % 10;
                high = (next.getValue() - low) / 10;
                next.setValue(low);
            }
            Node<Integer> current = Node.of(high + a.getValue() + b.getValue());
            current.setNext(next);
            return current;
        } else {
            return Node.of(a.getValue() + b.getValue());
        }
    }
}
