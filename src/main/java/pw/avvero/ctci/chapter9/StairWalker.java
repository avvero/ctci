package pw.avvero.ctci.chapter9;

import java.util.ArrayList;
import java.util.List;

public class StairWalker {
    public static List<List<Integer>> getWays(Integer n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ways = new ArrayList<>();
        for (int i = 1; i <= 3 && n >= i; i++) {
            List<List<Integer>> subWays = getWays(n - i);
            int finalI = i;
            subWays.forEach(l -> l.add(finalI));
            if (n == i) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                subWays.add(list);
            }
            //
            ways.addAll(subWays);
        }
        return ways;
    }

    public static int getWaysNumberRecursion(Integer n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return getWaysNumberRecursion(n - 1) + getWaysNumberRecursion(n - 2) + getWaysNumberRecursion(n - 3);
    }

    public static int getWaysNumberDp(Integer n) {
        int[] r = new int[n + 3];
        r[1] = 1;
        r[2] = 2;
        r[3] = 4;
        for (int i = 4; i <= n; i++) {
            r[i] = r[i - 1] + r[i - 2] + r[i - 3];
        }
        return r[n];
    }
}
