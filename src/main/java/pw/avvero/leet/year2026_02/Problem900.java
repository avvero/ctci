package pw.avvero.leet.year2026_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Problem900 {

    int i = 0;
    int[] encoding = null;

    public Problem900(int[] encoding) {
        this.encoding = encoding;
    }

    public int next(int n) {
        while (n > 0 && i < encoding.length) {
            if (n > encoding[i]) {
                n -= encoding[i];
                encoding[i] = 0;
                i += 2;
            } else {
                encoding[i] -= n;
                n = 0;
            }
        }
        if (i >= encoding.length) return -1;
        if (encoding[i] < 0) return -1;
        return encoding[i];
    }
}
