package pw.avvero.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem70 {

    public int climbStairs(int n) {
        return climb(0, n);
    }

    private int climb(int entry, int n) {
        if (entry == n) {
            return 1;
        } else if (entry > n) {
            return 0;
        }
        int r = 0;
        for (int i = 1; i <=2; i++) {
            entry += i;
            r += climb(entry, n);
            entry -= i;
        }
        return r;
    }
}
