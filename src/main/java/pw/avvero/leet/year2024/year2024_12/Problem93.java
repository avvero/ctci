package pw.avvero.leet.year2024.year2024_12;

import java.util.ArrayList;
import java.util.List;

public class Problem93 {

    public List<String> restoreIpAddresses(String s) {
        char[] chars = s.toCharArray();
        List<String> result = new ArrayList<>();
        List<Integer> entry = new ArrayList<>();
        traverse(chars, 0, entry, result);
        return result;
    }

    private void traverse(char[] chars, int s, List<Integer> entry, List<String> result) {
        if (entry.size() == 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < entry.size(); i++) {
                sb.append(entry.get(i));
                if (i < entry.size() - 1) {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (chars.length - s > ((4 - entry.size()) * 3)) return;
            if (entry.size() == 3 && chars.length - s - i > 0) continue; // last should take all

            Integer n = 0;
            int times = 0;
            for (int j = s; j < chars.length && j < s + i; j++) {
                if (i > 1) {
                    n *= 10;
                }
                n += chars[j] - '0';
                times++;
            }
            if (times == 0) continue;
            if (n > 255) continue;

            entry.add(n);
            traverse(chars, s + i, entry, result);
            entry.remove(entry.size() - 1);
        }
    }
}
