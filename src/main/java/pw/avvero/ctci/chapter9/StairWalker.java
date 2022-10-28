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
}
