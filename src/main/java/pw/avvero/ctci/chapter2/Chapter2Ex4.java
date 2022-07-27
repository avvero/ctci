package pw.avvero.ctci.chapter2;

public class Chapter2Ex4 {

    public static Node<Integer> order(Node<Integer> node, Integer value) {
        Node<Integer> left = null;
        Node<Integer> leftHead = null;
        Node<Integer> pillar = null;
        Node<Integer> right = null;
        Node<Integer> rightHead = null;

        Node<Integer> current = node;
        while (current != null) {
            Integer currentValue = current.getValue();
            Node<Integer> candidate = Node.of(currentValue);
            if (currentValue.compareTo(value) < 0) {
                if (left == null) {
                    left = candidate;
                    leftHead = candidate;
                } else {
                    left.setNext(candidate);
                    left = candidate;
                }
            } else if (currentValue.compareTo(value) > 0) {
                if (right == null) {
                    right = candidate;
                    rightHead = candidate;
                } else {
                    right.setNext(candidate);
                    right = candidate;
                }
            } else {
                pillar = candidate;
            }
            current = current.getNext();
        }
        left.setNext(pillar);
        pillar.setNext(rightHead);
        return leftHead;
    }

}
