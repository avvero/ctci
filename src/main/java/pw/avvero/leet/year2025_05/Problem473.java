package pw.avvero.leet.year2025_05;

import java.util.Arrays;

public class Problem473 {

    public boolean makesquare(int[] matchsticks) {
        int p = 0;
        for (int m : matchsticks) {
            p += m;
        }
        if (p % 4 != 0) return false;
        return traverse(matchsticks, 0, new int[4], p / 4);
    }

    private boolean traverse(int[] matchsticks, int i, int[] buckets, int l) {
        if (i == matchsticks.length) {
            for (int j = 0; j < buckets.length; j++) {
                if (buckets[j] != l) return false;
            }
            return true;
        }
        for (int j = 0; j < buckets.length; j++) {
            buckets[j] += matchsticks[i];
            boolean result = buckets[j] <= l && traverse(matchsticks, i + 1, buckets, l);
            if (result) return result;
            buckets[j] -= matchsticks[i];
        }
        return false;
    }
}
