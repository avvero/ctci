package pw.avvero.ctci.chapter2;

import java.util.HashSet;
import java.util.Set;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    public void add(T value) {
        if (first == null) {
            first = Node.of(value);
            last = null;
        } else if (last == null) {
            first.next = Node.of(value);
            last = first.next;
        } else {
            last.next = Node.of(value);
            last = last.next;
        }
    }

    public T poll() {
        if (first == null) return null;
        T value = first.value;
        first = first.next;
        return value;
    }

    public T peek() {
        return first != null ? first.value : null;
    }

    @Override
    public String toString() {
        if (first == null) return "[]";

        Set<Node<T>> cache = new HashSet<>();
        StringBuilder s = new StringBuilder("[");
        Node<T> node = first;
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
