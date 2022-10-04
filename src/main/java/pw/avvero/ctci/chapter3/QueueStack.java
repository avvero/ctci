package pw.avvero.ctci.chapter3;

public class QueueStack<T> {

    public Stack<T> stack = new Stack<>();

    public void add(T value) {
        stack.push(value);
    }

    public T pop() {
        Stack<T> q = new Stack<>();
        T t = stack.pop();
        while (t != null) {
            q.push(t);
            t = stack.pop();
        }
        T result = q.pop();
        t = q.pop();
        while (t != null) {
            stack.push(t);
            t = q.pop();
        }
        return result;
    }

    public T peek() {
        Stack<T> q = new Stack<>();
        T t = stack.pop();
        while (t != null) {
            q.push(t);
            t = stack.pop();
        }
        T result = q.peek();
        t = q.pop();
        while (t != null) {
            stack.push(t);
            t = q.pop();
        }
        return result;
    }

    @Override
    public String toString() {
        Stack<T> q = new Stack<>();
        T t = stack.pop();
        while (t != null) {
            q.push(t);
            t = stack.pop();
        }
        String result = q.toString();
        t = q.pop();
        while (t != null) {
            stack.push(t);
            t = q.pop();
        }
        return result;
    }
}
