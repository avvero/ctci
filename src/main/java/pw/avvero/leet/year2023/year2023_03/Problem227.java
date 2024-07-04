package pw.avvero.leet.year2023.year2023_03;

public class Problem227 {

    public int calculate(String s) {
        return calculate(s.toCharArray(), 0);
    }

    private int calculate(char[] chars, int start) {
        int[] a = nextDigit(chars, start);
        char[] operator = nextOperator(chars, a[0]);
        if (operator[0] == 0) return a[1]; // last digit

        int[] b = nextDigit(chars, operator[0]);
        char[] operatorNext = nextOperator(chars, b[0]);
        if (operatorNext[0] == 0) {
            return calculate(a[1], b[1], operator[1]);
        } else {
            if (nextIsHigher(operator[1], operatorNext[1])) {
                return calculate(a[1], calculate(chars, operator[0]), operator[1]);
            } else {
                int cur = calculate(a[1], b[1], operator[1]);
                return calculate(cur, calculate(chars, operatorNext[0]), operatorNext[1]);
            }
        }
    }

    private int[] nextDigit(char[] chars, int start) {
        int[] a = new int[]{-1, 0};
        for (int i = start; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            if (chars[i] == '-' || chars[i] == '+' || chars[i] == '*' || chars[i] == '/') break;
            a[0] = i + 1;
            a[1] = a[1] * 10 + chars[i] - '0';
        }
        return a;
    }


    private char[] nextOperator(char[] chars, int start) {
        char[] op = new char[]{0, 0};
        for (int i = start; i > 0 && i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            if (chars[i] == '-' || chars[i] == '+' || chars[i] == '*' || chars[i] == '/') {
                op[0] = (char) (i + 1);
                op[1] = chars[i];
                break;
            }
            break;
        }
        return op;
    }

    private int calculate(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        if (op == '/') return a / b;
        return 1;
    }

    private boolean nextIsHigher(char op1, char op2) {
        if ((op1 == '+' || op1 == '-') && (op2 == '*' || op2 == '/')) return true;
        return false;
    }
}
