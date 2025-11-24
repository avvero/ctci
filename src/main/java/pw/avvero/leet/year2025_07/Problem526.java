package pw.avvero.leet.year2025_07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem526 {

    public int countArrangement(int n) {
        int[] result = new int[]{0};
        traverse(n, 1, new ArrayList<>(), new HashSet<>(), result);
        return result[0];
    }

    private void traverse(int n, int s, List<Integer> entry, HashSet<Integer> mem, int[] result) {
        if (entry.size() == n) {
            if (beautiful(entry)) {
                result[0]++;
            }
            return;
        }
        for (int i = s; i <= n; i++) {
            if (mem.contains(i)) continue;
            entry.add(i);
            mem.add(i);
            traverse(n, i + 1, entry, mem, result);
            entry.remove(entry.size() - 1);
            mem.remove(i);
        }
    }

    private boolean beautiful(List<Integer> list) {
        boolean beautiful = true;
        for (int i = 1; i <= list.size(); i++) {
            if ((list.get(i - 1) % i == 0) || (i % list.get(i - 1) == 0)) {

            } else {
                beautiful = false;
                break;
            }
        }
        return beautiful;
    }
}
