package pw.avvero.leet.year2023.year2023_07;

import java.util.LinkedList;

public class Problem224 {

    public int calculate(String s) {
        LinkedList stack = new LinkedList();

        long result = 0;
        long number = 0;
        long sign = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           if (Character.isDigit(chars[i])) {
               number = number * 10 + chars[i] - '0';
           } else if (chars[i] == '+') {
               result += number * sign;
               number = 0;
               sign = 1;
           } else if (chars[i] == '-') {
               result += number * sign;
               number = 0;
               sign = -1;
           } else if (chars[i] == '(') {
               stack.push(result);
               stack.push(sign);
               sign = 1;
               result = 0;
           } else if (chars[i] == ')') {
               result += number * sign;
               number = 0;
               result *= (Long) stack.pop();
               result += (Long) stack.pop();
           }
        }
        if(number != 0) result += sign * number;
        return (int )result;
    }

}
