package pw.avvero.leet;

import java.util.HashMap;

public class Problem567 {

    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s2.toCharArray();
        char[] schars = s1.toCharArray();
        HashMap<Character, Integer> bufferBack = new HashMap<>();
        for (char ch : schars) {
            capture(bufferBack, ch);
        }
        HashMap<Character, Integer> remains = new HashMap<>(bufferBack);
        boolean bufferChanged = false;
        HashMap<Character, Integer> captured = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (bufferChanged) {
                bufferChanged = false;
                remains = new HashMap<>(bufferBack);
            }
            captured = captured.size() == 0 ? captured : new HashMap<>();
            if (remove(remains, chars[i])) {
                bufferChanged = true;
                capture(captured, chars[i]);

                if (remains.size() == 0) return true;
                int j = i + 1;
                int max = j;
                boolean fromCaptured = false;
                while (j < chars.length && (remove(remains, chars[j]) || (fromCaptured = remove(captured, chars[j])))) {
                    if (fromCaptured) {
                        capture(captured, chars[j]);
                    } else {
//                        capture(remains, chars[j]);
                    }
                    if (remains.size() == 0) return true;
                    max = ++j;
                }
                i = max;
            }
        }
        return false;
    }

    private HashMap<Character, Integer> capture(HashMap<Character, Integer> map, char ch) {
        if (map == null) {
            map = new HashMap<>();
        }
        Integer n = map.get(ch);
        if (n == null) {
            n = 0;
            map.put(ch, 0);
        }
        n++;
        map.put(ch, n);
        return map;
    }

    private boolean remove(HashMap<Character, Integer> map, char ch) {
        Integer n = map.get(ch);
        if (n == null) return false;
        n--;
        if (n == 0) {
            map.remove(ch);
        } else {
            map.put(ch, n);
        }
        return true;
    }

}
