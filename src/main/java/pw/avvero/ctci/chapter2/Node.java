package pw.avvero.ctci.chapter2;

import java.util.Iterator;
import java.util.List;

public class Node<T> {

    private Node<T> next;
    private T value;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> Node<T> of(T value) {
        Node<T> node = new Node<>();
        node.setValue(value);
        return node;
    }

    public static <T> Node<T> of(List<T> list) {
        Iterator<T> iterator = list.iterator();
        Node<T> prev = new Node<>();
        prev.value = iterator.hasNext() ? iterator.next(): null;
        Node<T> root = prev;
        while (iterator.hasNext()) {
            Node<T> node = new Node<>();
            node.value = iterator.next();
            prev.next = node;
            prev = node;
        }
        return root;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");

        Node<T> node = this;
        do {
            s.append(node.value);
            node = node.next;
            if (node !=null) {
                s.append(", ");
            }
        } while (node != null);
        s.append("]");
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        Node<T> origin = this;
        Node<T> target = (Node<T>) o;
        while (origin != null && target != null) {
            if (origin.value != target.value) return false;
            origin = origin.next;
            target = target.next;
            if (origin == null && target != null) return false;
            if (origin != null && target == null) return false;
        }
        return true;
    }
}
