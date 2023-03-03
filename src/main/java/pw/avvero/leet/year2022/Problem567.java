package pw.avvero.leet.year2022;

import java.util.HashMap;
import java.util.LinkedList;

public class Problem567 {

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return false;
        }
        int[] values = new int[123];
        int toBeMatched = len1, i = 0, j = 0;
        for (; i < len1; i++) {
            values[s1.charAt(i)]++;
        }
        i = 0;
        int current, running;
        while (i < len2) {
            current = s2.charAt(i++);
            if (values[current] > 0) {
                values[current]--;
                if (--toBeMatched == 0) {
                    return true;
                }
            } else {
                running = s2.charAt(j);
                while (running != current) {
                    values[running]++;
                    toBeMatched++;
                    running = s2.charAt(++j);
                }
                j++;
            }
        }
        return false;
    }

}
