package pw.avvero.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem91 {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] result = new int[1];
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> entry = new ArrayList<>();
        numDecodings(chars, 0, 0, result, resultList, entry);
        return resultList.size();
    }

    private void numDecodings(char[] chars, int s, int e, int[] result, List<List<Integer>> resultList, List<Integer> entry) {
        if (s >= chars.length || e >= chars.length) {
            return;
        }
        for (int i = 0; i <=1; i++) {
            int num = number(chars, s, s + i);
            if (num == 0) return;
            entry.add(num);
            if (s + i == chars.length - 1) {
                resultList.add(new ArrayList<>(entry));
            }
            numDecodings(chars, s + i + 1, s + i + 1, result, resultList, entry);
            entry.remove(entry.size() - 1);
        }
    }

    private int number(char[] chars, int s, int e) {
        if (s >= chars.length || e >= chars.length) return 0;
        if (e - s == 1) {
            if (chars[s] == '0') return 0;
            int num = (chars[s] - '0') * 10 + chars[s + 1] - '0';
            if (num >= 1 && num <= 26) return num;
        } else if (e == s) {
            int num = chars[s] - '0';
            if (num >= 1 && num <= 26) return num;
        }
        return 0;
    }
}
