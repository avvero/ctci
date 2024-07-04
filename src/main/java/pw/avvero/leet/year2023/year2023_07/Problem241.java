package pw.avvero.leet.year2023.year2023_07;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem241 {

    public List<Integer> diffWaysToCompute(String expressionString) {
        LinkedList expression = new LinkedList();
        int number = 0;
        for (int i = 0; i < expressionString.length(); i++) {
            char c = expressionString.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            } else {
                expression.add(number);
                number = 0;
                expression.add(c);
            }
        }
        expression.add(number);
        //
        LinkedList entry = new LinkedList();
        List<LinkedList> result = new LinkedList();
        diffWaysToCompute(expression, entry, 0, result);
        return Collections.emptyList();
    }

    // 2-1-1
    // 21-1
    // 2-1
    // 21

    // 2-

    private void diffWaysToCompute(LinkedList expression, LinkedList entry, int s, List<LinkedList> result) {
        if (entry.size() == 3) {
            entry.add(eval(entry.removeLast(), entry.removeLast(), entry.removeLast()));
            entry.add(eval(entry.removeLast(), entry.removeLast(), entry.removeLast()));
        }
        if (entry.size() == expression.size()) {
            result.add(new LinkedList(entry));
            return;
        }
        for (int i = s; i < expression.size(); i++) {
            entry.add(expression.get(i));
            diffWaysToCompute(expression, entry, i + 1, result);
            entry.removeLast();
        }
    }

    private int eval(Object b, Object o, Object a) {
        if ((Character) o == '+') {
            return (Integer) a + (Integer) b;
        } else if ((Character) o == '-') {
            return (Integer) a - (Integer) b;
        } else {
            return (Integer) a * (Integer) b;
        }
    }

}
