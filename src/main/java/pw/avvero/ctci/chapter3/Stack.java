package pw.avvero.ctci.chapter3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stack<T> {

    Node<T> head;
    private int size;

    public static <T> Stack<T> of(List<T> entries) {
        Stack<T> stack = new Stack<>();
        for (T t : entries) {
            stack.push(t);
        }
        return stack;
    }

    public void push(T value) {
        if (head == null) {
            head = Node.of(value);
        } else {
            head = Node.of(value, head);
        }
        size++;
    }

    public T pop() {
        Node<T> result = head;
        head = result.next;
        size--;
        return result.value;
    }

    public T peek() {
        return head != null ? head.value : null;
    }

    public int getSize() {
        return size;
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
