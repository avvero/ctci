package pw.avvero.ctci.chapter3;

public class StackTransfer {

    private final Stack<Integer> source;
    private final Stack<Integer> middle;
    private final Stack<Integer> target;

    public StackTransfer(Stack<Integer> source, Stack<Integer> middle, Stack<Integer> target) {
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

    private void move(Integer n, Stack<Integer> source, Stack<Integer> target, Stack<Integer> middle) {
        if (n == 1) {
            target.push(source.pop());
            return;
        }
        move(n - 1, source, middle, target);
        target.push(source.pop());
        move(n - 1, middle, target, source);
    }
}
