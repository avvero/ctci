package pw.avvero.leet.year2023_07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Problem224 {

    public int calculate(String s) {
        LinkedList postfix = toPostFix(s);
        LinkedList stack = new LinkedList();
        for (int i = 0; i < postfix.size(); i++) {
            if (postfix.get(i) instanceof Character) {
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                if ((Character) postfix.get(i) == '+') {
                    stack.push(a + b);
                } else {
                    stack.push(b - a);
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
        boolean digitSiquence = false;
        for (int i = 0; i < chars.length; i++) {
            boolean nonDigit = true;
            if (chars[i] >= '0' && chars[i] <= '9') {
                digitSiquence = true;
                a = a * 10 + chars[i] - '0';
                nonDigit = false;
            }
            if (nonDigit || i == chars.length - 1) { // last
                if (digitSiquence) {
                    digitSiquence = false;
                    stack.add(a);
                    a = 0;
                    if (operator.size() > 0) {
                        stack.add(operator.pop());
                    }
                }
                if (chars[i] != ' ') {
                    operator.add(chars[i]);
                }
            }
        }
        return stack;
    }

}
