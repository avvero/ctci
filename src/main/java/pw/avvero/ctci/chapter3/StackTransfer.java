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

    public Stack<T> getSource() {
        return source;
    }

    public Stack<T> getMiddle() {
        return middle;
    }

    public Stack<T> getTarget() {
        return target;
    }

    public void process() {

    }
}
