package pw.avvero.leet.year2026_02;

import java.util.LinkedList;
import java.util.List;

public class Problem696 {

    public int countBinarySubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (match(s, i, j)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean match(String s, int i, int j) {
        int length = j - i + 1;
        if (length % 2 > 0) return false;
        while (j > i) {
            if (s.charAt(i) == s.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}
