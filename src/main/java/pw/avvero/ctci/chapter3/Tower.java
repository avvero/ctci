package pw.avvero.ctci.chapter3;

import java.util.List;

public class Tower<T extends Comparable<T>> extends Stack<T> {

    public static <T extends Comparable<T>> Tower<T> of(List<T> entries) {
        Tower<T> tower = new Tower<>();
        for (T t : entries) {
            tower.push(t);
        }
        return tower;
    }

    public void push(T value) {
        if (value != null && this.peek() != null && value.compareTo(peek()) > 0) {
            throw new RuntimeException();
        }
        super.push(value);
    }

}
