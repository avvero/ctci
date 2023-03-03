package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.List;

public class Problem91 {
    private int[] cache = new int[1000];

    // 1 - 1
    // 11 - 2
    // 111 - 3
    // 1111 - 5
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        return numDecodings(chars, chars.length);
    }

    private int numDecodings(char[] chars, int n) {
        if (cache[n] > 0) return cache[n];

        if (n <= 0) return 0;
        if (n == 1) {
            return valid(chars, 0, 0) ? 1 : 0;
        }
        if (n == 2) {
            if (valid(chars, 0, 1) && valid(chars, 0, 0) && valid(chars, 1, 1)) return 2;
            if (valid(chars, 0, 1)) return 1;
            return valid(chars, 0, 1) ? 2 : valid(chars, 0, 0) && valid(chars, 1, 1) ? 1 : 0;
        }
        if (chars[n - 1] == '0' && chars[n - 2] == '0') {
            return 0;
        } else if (!valid(chars, n - 2, n - 1) && chars[n - 1] == '0') {
            return 0;
        } else if (chars[n - 1] == '0') {
            int result = numDecodings(chars, n - 2);
            cache[n] = result;
            return result;
        } else if (valid(chars, n - 2, n - 1)) {
            int result = numDecodings(chars, n - 2) + numDecodings(chars, n - 1);
            cache[n] = result;
            return result;
        } else {
            int result = numDecodings(chars, n - 1);
            cache[n] = result;
            return result;
        }
    }

    private boolean valid(char[] chars, int s, int e) {
        if (chars[s] == '0') return false;
        if (s == e && chars[s] >= '1' && chars[s] <= '9') {
            return true;
        } else {
            int num = (chars[s] - '0') * 10 + chars[e] - '0';
            return num > 0 && num <= 26;
        }
    }
}
