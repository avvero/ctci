package pw.avvero.leet.year2023_07;

import java.util.LinkedList;

public class Problem224 {

    public int calculate(String s) {
        long result = 0;
        LinkedList stack = new LinkedList();
        LinkedList operand = new LinkedList();
        long d = 0;
        boolean dseq = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') continue;
            if (isDigit(c)) {
                dseq = true;
                d = d * 10 + c - '0';
            } else {
                if (dseq) {
                    stack.add(d);
                    d = 0;
                    dseq = false;
                }
                //
                if (operand.size() > 0) {
                    if (c == ')') {
                        char o = (Character) operand.peekLast();
                        while (o != '(') {
                            if (operand.size() > 0) {
                                evalStack(stack, operand);
                            }
                            o = operand.peekLast() != null ? (Character) operand.peekLast() : 0;
                        }
                        operand.removeLast();
                    } else if ((c == '+' || c == '-' ) && (Character) operand.peekLast() != '(') {
                        evalStack(stack, operand);
                    }
                }
                //
                if (c != ')') {
                    operand.add(c);
                }
            }
        }
        if (dseq) {
            stack.add(d);
        }
        if (operand.size() > 0) {
            evalStack(stack, operand);
        }
        return ((Long) stack.removeLast()).intValue();
    }

    private void evalStack(LinkedList stack, LinkedList operand) {
        long b = (long) stack.removeLast();
        long a = (long) stack.removeLast();
        char o = (Character) operand.removeLast();
        if (o == '+') {
            stack.add(a + b);
        } else if (o == '-') {
            stack.add(a - b);
        }
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
