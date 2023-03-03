package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;

        int result = 0;
        int sn = 1;
        char[] chars = s.toCharArray();
        int i = 0;
        while(i < chars.length && chars[i] == ' ') {
            i++;
            continue;
        }
        if (i < chars.length && (chars[i] == '+' || chars[i] == '-')) {
            sn = chars[i] == '+' ? 1 : -1;
            i++;
        };
        for (; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') break;
            int old = result;
            result = result * 10 + (chars[i] - '0');
            if (result < 0 || (result - (chars[i] - '0')) / 10 != old) {
                return sn == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return sn * result;
    }
}
