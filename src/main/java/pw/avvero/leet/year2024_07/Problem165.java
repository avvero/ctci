package pw.avvero.leet.year2024_07;

import java.util.Arrays;

public class Problem165 {

    public int compareVersion(String version1, String version2) {
        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");
        int size = Math.max(revisions1.length, revisions2.length);
        for (int i = 0; i < size; i++) {
            int c = compareRevision(revisions1[i], revisions2[i]);
            if (c != 0) {
                return c;
            }
        }
        return 0;
    }

    private int compareRevision(String revisions1, String revisions2) {
        return Integer.valueOf(revisions1).compareTo(Integer.valueOf(revisions2));
    }
}
