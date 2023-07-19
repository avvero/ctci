package pw.avvero.leet.year2023_07;

import java.util.LinkedList;

public class Problem224 {

    public int calculate(String s) {
        LinkedList postfix = toPostFix(s);
        LinkedList stack = new LinkedList();
        for (int i = 0; i < postfix.size(); i++) {
            if (postfix.get(i) instanceof Character) {
                int b = (int) stack.pop();
                int a = stack.peekFirst() != null ? (int) stack.pop() : 0;
                if ((Character) postfix.get(i) == '+') {
                    stack.push(a + b);
                } else if ((Character) postfix.get(i) == '-') {
                    stack.push(a - b);
                }
            } else {
                stack.push(postfix.get(i));
            }
        }
        return (int) stack.pop();
    }

    private LinkedList toPostFix(String s) {
        LinkedList stack = new LinkedList();
        LinkedList operator = new LinkedList();
        char[] chars = s.toCharArray();
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (isDigit(chars[i])) {
                a = a * 10 + chars[i] - '0';
                if (i == chars.length - 1 || !isDigit(chars[i + 1])) {
                    stack.add(a);
                    a = 0;
                }
            } else {
                if (chars[i] == ' ') continue;
                if (chars[i] == ')') {
                    Character c = (Character) operator.removeLast();
                    while (c != '(') {
                        stack.add(c);
                        c = (Character) operator.removeLast();
                    }
                }
                if (chars[i] == '(') {
                    operator.add(chars[i]);
                }
                if (chars[i] == '+' || chars[i] == '-') {
                    if (operator.size() > 0 && (Character) operator.getLast() != '(') {
                        stack.add(operator.removeLast());
                    }
                    operator.add(chars[i]);
                }
            }
        }
        while (operator.size() > 0) {
            stack.add(operator.removeLast());
        }
        return stack;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
