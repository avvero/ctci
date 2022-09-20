package pw.avvero.ctci.chapter3;

public class StackPack<T> {

    private final int stackMaxSize;
    private Stack<Tuple<Integer, Stack<T>>> head;

    public StackPack(int stackMaxSize) {
        this.stackMaxSize = stackMaxSize;
    }

    public void push(T value) {
        if (head == null) {
            head = new Stack<>();
            Stack<T> subStack = new Stack<>();
            head.push(new Tuple<>(0, subStack));
            subStack.push(value);
        } else if (head.peek().v.getSize() < stackMaxSize) {
            head.peek().v.push(value);
        } else {
            Stack<T> subStack = new Stack<>();
            head.push(new Tuple<>(head.peek().k + 1, subStack));
            subStack.push(value);
        }
    }

    public T pop() {
        if (head == null) return null;
        Stack<T> subStack = head.peek().v;
        do {
            if (subStack == null) return null;
            T value = subStack.pop();
            if (value == null) {
                subStack = head.pop().v;
            } else {
                if (subStack.peek() == null) {
                    head.pop();
                }
                return value;
            }
        } while (true);
    }

    public T popAt(int i) {
        if (head == null) return null;
        Node<Tuple<Integer, Stack<T>>> node = head.head;
        do {
            if (node.value.k == i) return node.value.v.pop();
            node = node.next;
        } while (node != null);
        return null;
    }

    public T peek() {
        if (head.peek() == null) return null;
        return head.peek().v.peek();
    }

    @Override
    public String toString() {
        if (head == null) return "[]";
        return head.toString();
    }

    @Override
    public boolean equals(Object o) {
        String origin = this.toString();
        String target = o != null ? o.toString() : null;
        return origin.equals(target);
    }


}
