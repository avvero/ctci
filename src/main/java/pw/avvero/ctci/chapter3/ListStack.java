package pw.avvero.ctci.chapter3;

public class ListStack<T> {

    private T[] list;
    private int capacity;
    private int m;
    private Integer[] positions;

    public ListStack(int m) {
        this.capacity = 100; //TODO
        this.m = m;
        this.list = (T[]) new Object[capacity];
        this.positions = new Integer[m];
    }

    public void push(int i, T t) {
        positions[i] = positions[i] != null ? positions[i] + m : i;
        list[positions[i]] = t;
    }

    public T peek(int i) {
        if (positions[i] == null) return null;

        return list[positions[i]];
    }

    public T pop(int i) {
        if (positions[i] == null) return null;

        T value = list[positions[i]];
        positions[i] = positions[i] - m;
        if (positions[i] < 0) positions[i] = null;
        return value;
    }

    public String toString() {
        StringBuilder sbuilder = new StringBuilder("[");

        int maxPosition = 0;
        for (Integer position : positions) {
            if (position == null) continue;
            maxPosition = Math.max(position, maxPosition);
        }

        for (int i = 0; i < list.length && i <= maxPosition; i++) {
            sbuilder.append(list[i]).append(",");
        }
        sbuilder.append("]");
        return sbuilder.toString();
    }
}
