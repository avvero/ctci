package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem784 {

    // a1b2
    // 0000
    // 0010
    // 1010
    // 1000

    public List<String> letterCasePermutation(String s) {
        List<List<Integer>> mutations = new ArrayList();
        List<Integer> entry = new ArrayList<>();
        mutate(s.toCharArray(), mutations, entry, s.length(), 0);

        List<String> result = new ArrayList<>();
        for (List<Integer> mutation : mutations) {
            char[] source = s.toCharArray();
            for (int i = 0; i < mutation.size(); i++) {
                if (mutation.get(i) == 1) {
                    source[i] = source[i] < 'a' ? (char)(source[i] + 32) : (char)(source[i] - 32);
                }
            }
            result.add(new String(source));
        }
        return result;
    }

    private void mutate(char[] source, List<List<Integer>> mutations, List<Integer> entry, int n, int i) {
        if (entry.size() == n) {
            mutations.add(new ArrayList<>(entry));
            return;
        }
        for (int b = 0; b < 2; b++) {
            entry.add(b);
            // skip
            char c = source[entry.size()-1];
            if (c < 'A' || c > 'z') {
                b++;
            }
            mutate(source, mutations, entry, n, i);
            entry.remove(entry.size() - 1);
        }
    }
}
