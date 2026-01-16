package pw.avvero.leet.year2026_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem676 {

    private final Map<String, Set<Character>> maskToChars = new HashMap<>();
    private final Set<String> words = new HashSet<>();

    public Problem676() {}

    public void buildDict(String[] dictionary) {
        for (String w : dictionary) {
            words.add(w);
            int n = w.length();
            for (int i = 0; i < n; i++) {
                String mask = w.substring(0, i) + '*' + w.substring(i + 1);
                maskToChars.computeIfAbsent(mask, k -> new HashSet<>()).add(w.charAt(i));
            }
        }
    }

    public boolean search(String searchWord) {
        int n = searchWord.length();
        for (int i = 0; i < n; i++) {
            String mask = searchWord.substring(0, i) + '*' + searchWord.substring(i + 1);
            Set<Character> chars = maskToChars.get(mask);
            if (chars == null) continue;

            char c = searchWord.charAt(i);
            // Если по маске встречались иные буквы - можно заменить ровно один символ
            if (chars.size() > 1) return true;

            // Если встречалась ровно одна буква, то подходит только если она != текущей
            if (!chars.contains(c)) return true;
        }
        return false;
    }
}
