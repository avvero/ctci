package pw.avvero.leet.year2024.year2024_12;

import java.util.ArrayList;
import java.util.List;

public class Problem89 {

    public List<Integer> grayCode(int n) {
        List<Integer> entry = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        entry.add(0);
        int max = (int) Math.pow(2, n) - 1;
        traverse(1, max, entry, result);
        return result.get(0);
    }

    private void traverse(int s, int e, List<Integer> entry, List<List<Integer>> result) {
        int cur = entry.get(entry.size() - 1);
        if (entry.size() > 1 && !isOnBitDiff(cur, entry.get(entry.size() - 2))) {
            return;
        }
        if (entry.size() > 1 && isOnBitDiff(cur, entry.get(0))) {
            if (result.isEmpty()) {
                result.add(new ArrayList<>(entry));
            } else if (result.get(0).size() < entry.size()) {
                result.remove(0);
                result.add(entry);
            }
        }
        if (entry.size() == e + 1){
            return;
        }
        for (int i = s; i <= e; i++) {
            if (entry.contains(i)) continue;
            entry.add(i);
            traverse(s, e, entry, result);
            entry.remove(entry.size() - 1);
        }
    }

    private boolean isOnBitDiff(int a, int b) {
        int x = a ^ b;
        return x == (x & -x);
    }
}
