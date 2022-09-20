package pw.avvero.ctci.chapter3;

public class StackPack<T> {

    private final int stackMaxSize;
    private Stack<Stack<T>> head;

    public StackPack(int stackMaxSize) {
        this.stackMaxSize = stackMaxSize;
    }

    public void push(T value) {
        if (head == null) {
            head = new Stack<>();
            Stack<T> subStack = new Stack<>();
            head.push(subStack);
            subStack.push(value);
        } else if (head.peek().getSize() < stackMaxSize) {
            head.peek().push(value);
        } else {
            Stack<T> subStack = new Stack<>();
            head.push(subStack);
            subStack.push(value);
        }
    }

    public T pop() {
        if (head == null) return null;
        Stack<T> subStack = head.peek();
        do {
            if (subStack == null) return null;
            T value = subStack.pop();
            if (value == null) {
                subStack = head.pop();
            } else {
                if (subStack.peek() == null) {
                    head.pop();
                }
                return value;
            }
        } while (true);
    }

    public T peek() {
        if (head.peek() == null) return null;
        return head.peek().peek();
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
