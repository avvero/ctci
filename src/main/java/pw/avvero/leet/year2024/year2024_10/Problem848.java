package pw.avvero.leet.year2024.year2024_10;

import java.util.Arrays;

public class Problem848 {

    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        int[] sums = new int[shifts.length + 1];
        for (int i = 0; i < shifts.length; i++) {
            sums[i + 1] = sums[i] + shifts[i];
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shift(chars[i], sums[sums.length - 1] - sums[i]);
        }
        return new String(chars);
    }

    private static int S = 'z' - 'a';

    private char shift(char ch, int n) {
        int p = (ch - 'a' + n) % S;
        return (char) ('a' + p);
    }
}
