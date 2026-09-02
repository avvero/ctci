package pw.avvero.leet.year2026_02;

import java.util.HashMap;

public class Problem881 {

    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        int max = 0;
        for (int p : people) {
            max = Math.max(max, p);
        }
        int[] cap = new int[max + 1];
        for (int p : people) {
            cap[p]++;
        }
        for (int i = cap.length - 1; i >= 0;) {
            if (cap[i] == 0) {
                i--;
                continue;
            }
            cap[i]--;
            int r = limit - i;
            for (int j = r; j >=0; j--) {
                if (cap[j] == 0) continue;
                cap[j]--;
                break;
            }
            boats++;
            if (cap[i] == 0) {
                i--;
            }
        }
        return boats;
    }
}
