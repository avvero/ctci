package pw.avvero.leet.year2023_07;

import java.util.LinkedList;

public class Problem224 {

    public int calculate(String s) {
        LinkedList stack = new LinkedList();

        long result = 0;
        long n = 0;
        long sign = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           if (Character.isDigit(chars[i])) {
               n = n * 10 + chars[i] - '0';
           } else if (chars[i] == '+') {
               result += n * sign;
               n = 0;
               sign = 1;
           } else if (chars[i] == '-') {
               result += n * sign;
               n = 0;
               sign = -1;
           }
        }
        result += n * sign;
        return (int )result;
    }

}
