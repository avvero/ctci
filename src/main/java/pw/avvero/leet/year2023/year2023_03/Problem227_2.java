package pw.avvero.leet.year2023.year2023_03;

public class Problem227_2 {

    private class Node {
        boolean digit;
        int val;
        char chr;
        Node prev;
        Node next;
        public Node(boolean digit, int val, char chr, Node prev) {
            this.digit = digit;
            this.val = val;
            this.chr = chr;
            this.prev = prev;
        }
    }

    public int calculate(String s) {
        Node stack = null;
        Node root = null;
        Node operand = null;
        char[] chars = s.toCharArray();
        int number = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            if (isDigit(chars[i])) {
                number = number * 10 + chars[i] - '0';
            } else {
                // number from buffer push to stack
                Node node = new Node(true, number, '0', stack);
                if (stack == null) {
                    stack = node;
                    root = stack;
                } else {
                    stack.next = node;
                    stack = node;
                }
                number = 0;
                // push to stack
                if (operand != null && (operand.chr == '*' || operand.chr == '/')) {
                    node = new Node(false, '0', operand.chr, stack);
                    stack.next = node;
                    stack = node;
                    operand = operand.prev;
                    if (operand != null) {
                        operand.next = null;
                    }
                }
                // push operand to stack
                if (operand != null && (chars[i] == '+' || chars[i] == '-') && (operand.chr == '+' || operand.chr == '-')) {
                    node = new Node(false, '0', operand.chr, stack);
                    stack.next = node;
                    stack = node;
                    operand = operand.prev;
                    if (operand != null) {
                        operand.next = null;
                    }
                }
                // push to operands
                node = new Node(false, '0', chars[i], operand);
                if (operand == null) {
                    operand = node;
                } else {
                    operand.next = node;
                    operand = node;
                }
            }
        }
        // final digits push to stack
        Node node = new Node(true, number, '0', stack);
        if (stack == null) {
            stack = node;
            root = stack;
        } else {
            stack.next = node;
            stack = node;
        }
        // push operands to stack
        while (operand != null) {
            node = new Node(false, '0', operand.chr, stack);
            stack.next = node;
            stack = node;
            operand = operand.prev;
        }
        while (root.next != null) {
            while (root.digit) {
                root = root.next;
            }
            Node next = root.next;
            Node a = root.prev.prev;
            Node b = root.prev;
            int result = calculate(a.val, b.val, root.chr);
            root = new Node(true, result, '0', a.prev);
            root.next = next;
            if (next != null) {
                next.prev = root;
            }
        }
        return root.val;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private int calculate(int a, int b, char c) {
        return switch(c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}
