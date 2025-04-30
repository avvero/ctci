package pw.avvero.leet.year2025_04;

import java.util.HashMap;
import java.util.Map;

public class Problem447 {

    public int numberOfBoomerangs(int[][] points) {
        if (points.length < 3) return 0;
        int result = 0;
        for (int[] a : points) {
            HashMap<Integer, Integer> distances = new HashMap<>();
            for (int[] b : points) {
                if (a == b) continue;
                int d = distance(a, b);
                distances.put(d, distances.getOrDefault(d, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
                if (entry.getValue() < 2) continue;
                // 2 - 2
                // 3 - 6
                // 4 - 12
                result += entry.getValue() * (entry.getValue() - 1);
            }
        }
        return result;
    }

    private int distance(int[] a, int[] b) {
        return Math.max(a[0] - b[0], a[1] - b[1]);
    }
}
