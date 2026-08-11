package pw.avvero.leet.year2026_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem855 {

    private int n = 0;
    private List<Integer> seats = new ArrayList<>();

    public Problem855(int n) {
        this.n = n;
    }

    // 0 1 2 3
    // .
    //
    public int seat() {
        if (seats.size() == 0) {
            seats.add(0);
            return 0;
        }
        //
        int pos = 0;
        int dist = 0;
        if (seats.get(0) > dist) {
            pos = -1;
            dist = seats.get(0) - 1;
        }
        //
        for (int i = 0; i < seats.size() - 1; i++) {
            int a = seats.get(i);
            int b = seats.get(i + 1);
            int distSoFar = (b - a) / 2;
            if (distSoFar > dist) {
                pos = i + 1;
                dist = distSoFar;
            }
        }
        //
        int last = seats.get(seats.size() - 1);
        if (n - last - 1 > dist) {
            pos = n;
            dist = n  - last;
        }
        //
        if (pos == -1) {
            seats.add(0, 0);
            return 0;
        } else if (pos == n) {
            seats.add(n - 1);
            return n - 1;
        } else {
            int a = seats.get(pos - 1);
            seats.add(pos, a + dist);
            return a + dist;
        }
    }

    public void leave(int p) {
        int i = 0;
        for (; i < seats.size(); i++) {
            if (seats.get(i) == p) break;
        }
        seats.remove(i);
    }
}
