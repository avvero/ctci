package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    int[] cache = new int[1000000];

    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String result = new String(new char[]{s.charAt(0)});

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                int l = j - i + 1;
                if (l > result.length() && isPalindrom(chars, i, j, cache)) {
                    char[] c = new char[l];
                    System.arraycopy(chars, i, c, 0, l);
                    result = new String(c);
                }
            }
        }
        return result;
    }

    private boolean isPalindrom(char[] chars, int s, int e, int[] cache) {
        if (e == s) return false;

        int hash = s + (e << 5);
        if (cache[hash] == 1) return true;

        while (e > s) {
            if (chars[s++] != chars[e--]) {
                return false;
            }
        }
        cache[hash] = 1;
        return true;
    }
}
