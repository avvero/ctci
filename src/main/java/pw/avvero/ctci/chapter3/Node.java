package pw.avvero.ctci.chapter3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Node<T> {

    protected Node<T> next;
    protected T value;

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

    public static <T> Node<T> of(T value, Node<T> next) {
        Node<T> node = new Node<>();
        node.setValue(value);
        node.setNext(next);
        return node;
    }

    public static <T> Node<T> of(List<T> list) {
        Iterator<T> iterator = list.iterator();
        Node<T> prev = new Node<>();
        prev.value = iterator.hasNext() ? iterator.next() : null;
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
        Set<Node<T>> cache = new HashSet<>();
        StringBuilder s = new StringBuilder("[");
        Node<T> node = this;
        do {
            s.append(node.value);
            node = node.next;
            if (node != null) {
                s.append(", ");
            }
        } while (node != null && cache.add(node));
        s.append("]");
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        String origin = this.toString();
        String target = o != null ? o.toString() : null;
        return origin.equals(target);
    }
}
