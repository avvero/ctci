package pw.avvero.leet.year2025_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem187 {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 10) return List.of();
        HashMap<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            List<Integer> idx = map.getOrDefault(sub, new ArrayList<>());
            if (idx.size() > 0 && idx.get(0) <= i - 10) {
                result.add(sub);
            }
            idx.add(i);
        }
        return result;
    }
}
