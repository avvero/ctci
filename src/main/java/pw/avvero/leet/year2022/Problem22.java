package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem22 {

    private char[] s = new char[]{'(', ')'};

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] entry = new char[n*2];
        generateParenthesis(result, entry, n*2, 0);
        return result;
    }

    private void generateParenthesis(List<String> result, char[] entry, int n, int e) {
        if (e == n) {
            if (correct(entry, new int[]{0}, '0')) {
                result.add(new String(entry));
            }
            return;
        }
        for (int i = 0; i < s.length; i++) {
            entry[e] = s[i];
            e++;
            generateParenthesis(result, entry, n, e);
            e--;
        }
    }

    private boolean correct(char[] entry, int[] cur, int exp) {
        if (cur[0] == entry.length && exp != '0') return false;

        for (; cur[0] < entry.length;) {
            if (entry[cur[0]] == '(') {
                cur[0]++;
                boolean result = correct(entry, cur, ')');
                if (!result) return false;
            } else if (entry[cur[0]] == exp) {
                cur[0]++;
                return true;
            } else {
                return false;
            }
        }
        return exp == '0';
    }
}
