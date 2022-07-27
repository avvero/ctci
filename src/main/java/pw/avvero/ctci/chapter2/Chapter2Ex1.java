package pw.avvero.ctci.chapter2;

import java.util.HashSet;

public class Chapter2Ex1 {

    public static <T> Node<T> removeDuplicates(Node<T> origin) {
        HashSet<T> set = new HashSet<>();
        set.add(origin.getValue());

        Node<T> current = origin;
        while (current.getNext() != null) {
            Node<T> next = current.getNext();
            if (set.add(next.getValue())) {
                current = next;
            } else {
                current.setNext(next.getNext());
            }
        }
        return origin;
    }

    public static <T> Node<T> removeDuplicates2(Node<T> origin) {
        Node<T> current = origin;
        while (current.getNext() != null) {
            Node<T> next = current.getNext();
            if (!contains(origin, next)) {
                current = next;
            } else {
                current.setNext(next.getNext());
            }
        }
        return origin;
    }

    private static <T> boolean contains(Node<T> current, Node<T> entry) {
        while (current != null && current != entry) {
            if (current.getValue().equals(entry.getValue())) return true;
            current = current.getNext();
        }
        return false;
    }
}
