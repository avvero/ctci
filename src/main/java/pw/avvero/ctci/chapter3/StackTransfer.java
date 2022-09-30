package pw.avvero.ctci.chapter3;

public class StackTransfer<T> {

    private final Stack<T> source;
    private final Stack<T> middle;
    private final Stack<T> target;

    public StackTransfer(Stack<T> source, Stack<T> middle, Stack<T> target) {
        this.source = source;
        this.middle = middle;
        this.target = target;
    }

    public void process() {
        if (source.peek() == null) {
            return;
        }
        move(source.getSize(), source, target, middle);
    }

    private void move(Integer n, Stack<T> source, Stack<T> target, Stack<T> middle) {
        if (n == 1) {
            target.push(source.pop());
            return;
        }
        move(n - 1, source, middle, target);
        target.push(source.pop());
        move(n - 1, middle, target, source);
    }
}
