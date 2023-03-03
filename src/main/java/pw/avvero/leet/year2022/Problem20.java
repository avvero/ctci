package pw.avvero.leet.year2022;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem20 {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int[] cur = new int[]{0, chars.length};
        return isValid(chars, cur, '0');
    }

    private boolean isValid(char[] chars, int[]cur, char cl) {
        if (cur[0] == cur[1] && cl != '0') return false;

        while (cur[0] < cur[1]) {
            int i = cur[0];
            if (chars[i] == '(') {
                cur[0]++;
                boolean result = isValid(chars, cur, ')');
                if (!result) return false;
            } else if (chars[i] == '{') {
                cur[0]++;
                boolean result = isValid(chars, cur, '}');
                if (!result) return false;
            } else if (chars[i] == '[') {
                cur[0]++;
                boolean result = isValid(chars, cur, ']');
                if (!result) return false;
            } else if (chars[i] == cl) {
                cur[0]++;
                return true;
            } else {
                return false;
            }
        }
        return cl == '0';
    }
}
