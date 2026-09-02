package pw.avvero.leet.year2026_02;

import java.util.HashMap;

public class Problem880 {

    public String decodeAtIndex(String s, int k) {
        HashMap<Integer, Integer> indx = new HashMap<>();
        for (int i = 0; i < s.length() && k >= 0;) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (k == 1) return s.substring(i, i + 1);
                i++;
            } else {
                Integer ind = indx.get(i);
                if (ind == null) {
                    ind = s.charAt(i) - '0';
                    indx.put(i, ind);
                }
                if (ind == 1) {
                    indx.remove(i);
                    i++;
                    continue;
                } else {
                    indx.put(i, ind - 1);
                    i = 0;
                    continue;
                }
            }
            k--;
        }
        return "-1";
    }
}
