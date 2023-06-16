package pw.avvero.leet.year2023_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem30 {

    public List<Integer> findSubstring(String s, String[] words) {
        if (s.length() < words.length * words[0].length()) return Collections.emptyList();
        List<Integer> result = new LinkedList<>();
        Arrays.sort(words);
        int wl = words[0].length();
        for (int k = 0; k < wl; k++) { // loop over word length
            String[] sa = new String[s.length() / wl];
            int isa = 0;
            for (int i = k; i < s.length() && isa < sa.length; i += wl) {
                if (i + wl <= s.length()) {
                    sa[isa++] = s.substring(i, i + wl);
                } else {
                    sa[isa++] = "____";
                }

            }
            for (int i = 0; i < sa.length && i + words.length <= sa.length; i++) {
                String[] cp = Arrays.copyOfRange(sa, i, i + words.length);
                Arrays.sort(cp);
                if (isPermutation(cp, words)) {
                    result.add(k + i * wl);
                }
            }
        }
        return result;
    }

    private boolean isPermutation(String[] first, String[] second) {
        if (first.length != second.length) return false;
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) return false;
        }
        return true;
    }

}
