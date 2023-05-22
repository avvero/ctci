package pw.avvero.leet.year2023_05;

import java.util.HashMap;
import java.util.Random;

public class Problem395 {

    public int longestSubstring(String s, int k) {
        if (k == 1 && s.length() == 1) return 1;
        return longestSubstring(s.toCharArray(), 0, s.length() - 1, k);
    }

    private int longestSubstring(char[] chars, int s, int e, int k) {
        if (s == e) return 0;
        if (e - s + 1 < k) return 0;
        int max = Integer.MIN_VALUE;

        int[] counter = count(chars, s, e);
        if (hasLess(counter, k)) {
            int is = s;
            int i = is;
            while (i <= e) {
                int count = counter[chars[i] - 'a'];
                if (count > 0 && count < k) {
                    int maxSoFar = longestSubstring(chars, is, i - 1, k);
                    max = Math.max(max, maxSoFar);
                    is = i + 1;
                }
                i++;
            }
            // for last
            int maxSoFar = longestSubstring(chars, is, i - 1, k);
            max = Math.max(max, maxSoFar);

        } else {
            int maxSoFar = 0;
            for (int c: counter) {
                maxSoFar += c;
            }
            max = Math.max(max, maxSoFar);
        }
        return max;
    }

    private int[] count(char[] chars, int s, int e) {
        int[] counter = new int[26];
        for (int i = s; i <= e; i++) {
            counter[chars[i] - 'a']++;
        }
        return counter;
    }

    private boolean hasLess(int[] counter, int k) {
        for (int c : counter) {
            if (c > 0 && c < k) return true;
        }
        return false;
    }
}
