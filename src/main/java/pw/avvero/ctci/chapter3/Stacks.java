package pw.avvero.ctci.chapter3;

public class Stacks {

    public static <T extends Comparable<T>> void sort(Stack<T> stack) {
        Stack<T> result = stack;
        Stack<T> sorted = new Stack<>();
        while (stack.getSize() != 0) {
            Stack<T> buffer = new Stack<>();

            T min = stack.pop();
            if (min == null) break;
            T element = stack.pop();
            while (element != null) {
                if (min.compareTo(element) < 0) {
                    stack.push(min);
                    min = element;
                } else {
                    buffer.push(element);
                }
                element = stack.pop();
            }
            sorted.push(min);
            stack = buffer;
        }
        T element = sorted.pop();
        while (element != null) {
            result.push(element);
            element = sorted.pop();
        }
    }
}
