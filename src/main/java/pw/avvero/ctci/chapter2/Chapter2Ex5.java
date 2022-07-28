package pw.avvero.ctci.chapter2;

public class Chapter2Ex5 {

    public static Node<Integer> sumReversed(Node<Integer> a, Node<Integer> b, Integer high) {
        Integer sumValue = high / 10 + a.getValue() + b.getValue();
        Integer low = sumValue % 10;
        Node<Integer> current = Node.of(low);
        if (a.getNext() != null) {
            current.setNext(sumReversed(a.getNext(), b.getNext(), sumValue - low));
        }
        return current;
    }

    public static Node<Integer> sum(Node<Integer> a, Node<Integer> b) {
        if (a.getNext() != null) {
            Node<Integer> next = sum(a.getNext(), b.getNext());
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
