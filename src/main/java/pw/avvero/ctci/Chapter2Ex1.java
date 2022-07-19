package pw.avvero.ctci;

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
}
