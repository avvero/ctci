package pw.avvero.leet.year2023.year2023_06;

import java.util.ArrayList;
import java.util.List;

public class Problem68 {

    public List<String> fullJustify(String[] words, int maxWidth) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length();
        }
        List<String> result = new ArrayList<>();
        int width = 0;
        int s = 0;
        for (int i = 0; i < words.length; i++) {
            width += lengths[i] + 1;
            if (i < words.length - 1 && width + lengths[i + 1]> maxWidth) {
                result.add(toString(words, s, i, true));
                s = i + 1;
                width = 0;
                continue;
            }
            if (i == words.length - 1) {
                result.add(toString(words, s, i, false));
            }
        }
        return result;
    }

    private String toString(String[] words, int s, int e, boolean fullyJustified) {
        StringBuilder sb = new StringBuilder();
        for (int i = s; i <= e; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

}
