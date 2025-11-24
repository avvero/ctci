package pw.avvero.leet.year2025_10;

import java.util.*;

public class Problem621 {

    public int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> times = new HashMap<>();
        TreeMap<Integer, HashSet<Character>> treeTimes = new TreeMap<>((a, b) -> b - a);

        for (char task : tasks) {
            int t = times.getOrDefault(task, 0) + 1;
            times.put(task, t);
            HashSet<Character> set = treeTimes.get(t);
            if (set == null) {
                set = new HashSet<>();
                treeTimes.put(t, set);
            }
            set.add(task);
        }
        ArrayList<Character> result = new ArrayList<>();
        HashMap<Character, Integer> seen = new HashMap<>();
        while (treeTimes.size() > 0) {
            traverse(treeTimes, result, seen, n + 1, times.size());
        }
        return result.size();
    }

    private void traverse(
            TreeMap<Integer,
            HashSet<Character>> treeTimes,
            ArrayList<Character> result,
            HashMap<Character, Integer> seen,
            int n,
            int charNum
    ) {
        HashSet<Character> memo = new HashSet<>();
        for (Map.Entry<Integer, HashSet<Character>> entry : treeTimes.entrySet()) {
            if (memo.size() == charNum) break;
            for (Character ch : entry.getValue()) {
                memo.add(ch);
                //
                int i = result.size();
                if (i >= seen.getOrDefault(ch, -n) + n) {
                    seen.put(ch, result.size());
                    result.add(ch);
                    //
                    entry.getValue().remove(ch);
                    if (entry.getValue().size() == 0) {
                        treeTimes.remove(entry.getKey());
                    }
                    return;
                }
            }
        }
        result.add('_');
    }
}
