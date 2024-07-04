package pw.avvero.leet.year2023.year2023_06;

import java.util.HashMap;
import java.util.Map;

public class Problem290 {

    public boolean wordPattern(String pattern, String s) {
        String[] map1 = new String[128];
        Map<String, Character> map2 = new HashMap<>();
        String[] ss = s.split(" ");
        if (pattern.length() != s.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (map1[pattern.charAt(i)] == null) {
                map1[pattern.charAt(i)] = ss[i];
            } else if (!map1[pattern.charAt(i)].equals(ss[i])) {
                return false;
            }
            if (map2.get(ss[i]) == null) {
                map2.put(ss[i], pattern.charAt(i));
            } else if (map2.get(ss[i]) != pattern.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
