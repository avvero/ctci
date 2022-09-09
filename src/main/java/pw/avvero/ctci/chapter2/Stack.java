package pw.avvero.ctci.chapter2;

import java.util.HashSet;
import java.util.Set;

public class Stack<T> {

    private Node<T> head;

    public void push(T value) {
        if (head == null) {
            head = Node.of(value);
        } else {
            head = Node.of(value, head);
        }
    }

    public T pop() {
        Node<T> result = head;
        head = result.next;
        return result.value;
    }

    public T peek() {
        return head != null ? head.value : null;
    }

    @Override
    public String toString() {
        if (head == null) return "[]";

        Set<Node<T>> cache = new HashSet<>();
        StringBuilder s = new StringBuilder("[");
        Node<T> node = head;
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
