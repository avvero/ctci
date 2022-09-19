package pw.avvero.ctci.chapter3;

import java.util.HashSet;
import java.util.Set;

public class MinStack<T extends Comparable<T>> {

    private Node<Tuple<T, T>> head;

    public void push(T value) {
        if (head == null) {
            head = Node.of(new Tuple<>(value, value));
        } else {
            T min = head.value.v.compareTo(value) <= 0 ? head.value.v : value;
            head = Node.of(new Tuple<>(value, min), head);
        }
    }

    public T pop() {
        Node<Tuple<T, T>> result = head;
        head = result.next;
        return result.value.k;
    }

    public T peek() {
        return head != null ? head.value.k : null;
    }

    public T min() {
        return head != null ? head.value.v : null;
    }

    @Override
    public String toString() {
        if (head == null) return "[]";

        Set<Node<Tuple<T, T>>> cache = new HashSet<>();
        StringBuilder s = new StringBuilder("[");
        Node<Tuple<T, T>> node = head;
        do {
            s.append(node.value.k);
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
