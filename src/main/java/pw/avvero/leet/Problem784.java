package pw.avvero.leet;

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
        List<String> result = new ArrayList<>();
//        result.add(s);
        char[] entry = s.toCharArray();
        permutate(result, entry, 0, 0);
        if (result.size() == 1 && !result.get(0).equals(s)) {
            result.add(s);
        }
        return new HashSet<>(result).stream().toList();
    }

    private int permutate(List<String> result, char[] entry, int i, int e) {
        for (; i < entry.length; i++) {
            if (entry[i] < 'A' || entry[i] > 'z') {
                continue;
            } else {
                break;
            }
        }
        for (; e < entry.length; e++) {
            if (entry[e] < 'A' || entry[e] > 'z') {
                continue;
            } else {
                break;
            }
        }
        //e = Math.max(i, e);
        if (e == entry.length) {
            result.add(new String(entry));
            return e;
        }
        for (int j = i; j < entry.length; j++) {
            if (entry[j] < 'A' || entry[j] > 'z') {
                continue;
            };
            entry[j] = entry[j] < 'a' ? (char)(entry[j] + 32) : (char)(entry[j] - 32);
            //e = Math.max(j, e + 1);
            e++;
            e = permutate(result, entry, i, e);
            e--;
            //e = Math.max(j, e - 1);
            for (; e > 0; e--) {
                if (entry[e] < 'A' || entry[e] > 'z') {
                    continue;
                } else {
                    break;
                }
            }
        }
        return e;
    }
}
