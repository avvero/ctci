package pw.avvero.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(new ArrayList<>(), n, k, 1, result);
        return result;
    }

    private void combine(List<Integer> running, int n, int k, int s, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(running));
            return;
        }
        for (int i = s; i <= n - k + 1; i++) {
            running.add(i);
            combine(running, n, k - 1, i + 1, result);
            running.remove(running.size() - 1);
        }
    }
}
