package pw.avvero.ctci.chapter2;

public class Chapter2Ex3 {

    public static <T> Node<T> remove(Node<T> node, T value) {
        Node<T> root = node;
        Node<T> current = node;
        while (current != null && current.getNext() != null) {
            if (value.equals(current.getNext().getValue())) {
                current.setNext(current.getNext().getNext());
            }
            current = current.getNext();
        }
        return root;
    }

}
