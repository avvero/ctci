package pw.avvero.ctci;

import java.util.concurrent.atomic.AtomicInteger;

public class Chapter2Ex2 {

    public static <T> Node<T> findKthToLast(Node<T> origin, int size, int k) {
        int i = size - k;
        if (i < 0) return null;

        int position = 0;
        Node<T> current = origin;
        do {
            if (i == position) return current;
            current = current.getNext();
            position++;
        } while (current != null);
        return null;
    }

    public static <T> Node<T> findKthToLast(Node<T> origin, int k) {
        int size = 0;
        Node<T> current = origin;
        while (current != null) {
            ++size;
            current = current.getNext();
        }
        return findKthToLast(origin, size, k);
    }

    private static <T> Node<T> findKthToLast2(Node<T> origin, AtomicInteger k) {
        if (origin == null) {
            k.decrementAndGet();
            return null;
        }
        Node<T> result = findKthToLast2(origin.getNext(), k);
        if (result != null) {
            return result;
        } else if (k.intValue() == 0) {
            return origin;
        } else {
            k.decrementAndGet();
            return null;
        }
    }
}
