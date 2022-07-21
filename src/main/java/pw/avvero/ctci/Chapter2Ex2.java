package pw.avvero.ctci;

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
}
