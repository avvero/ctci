package pw.avvero.leet.year2023_03;

import java.util.HashMap;
import java.util.Map;

public class Problem150 {

    public int evalRPN(String[] tokens) {
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == null) continue;
            char ch = tokens[i].charAt(0);
            if (tokens[i].length() == 1 && ch < '0') {
                int ib = getPrevNumber(tokens, i);
                int ia = getPrevNumber(tokens, ib);
                int a = Integer.parseInt(tokens[ia]);
                int b = Integer.parseInt(tokens[ib]);
                result = operate(a, b, ch);
                tokens[i] = Integer.toString(result);
                tokens[ia] = null;
                tokens[ib] = null;
            }
        }
        return result;
    }

    private int getPrevNumber(String[] tokens, int end) {
        for (int i = end - 1; i >= 0; i--) {
            if (tokens[i] != null) return i;
        }
        throw new RuntimeException("Can't find " + end);
    }

    private int operate(int a, int b, char operation) {
        switch(operation) {
            case '+': {
                return a + b;
            }
            case '-': {
                return a - b;
            }
            case '*': {
                return a * b;
            }
            case '/': {
                return a / b;
            }
            default: throw new RuntimeException();
        }
    }

}
