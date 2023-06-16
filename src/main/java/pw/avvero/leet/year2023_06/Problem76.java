package pw.avvero.leet.year2023_06;

public class Problem76 {

    // ADOBECODEBANC
    // ADOBEC
    // BECODEBA
    // BANC

    public String minWindow(String s, String t) {
        int[] targetHash = new int[64];
        for (int i = 0; i < t.length(); i++) {
            targetHash[t.charAt(i) - 'A']++;
        }
        int[] w = new int[]{-1, -1};
        String min = "";
        do {
            int result = findNext(s, w, targetHash, t.length());
            if (result == 1) {
                String minSoFar = s.substring(w[0], w[1]);
                if (min.length() == 0 || minSoFar.length() < min.length()) {
                    min = minSoFar;
                }
            } else if (result == 2) {
                // continue further;
            } else {
                break;
            }
        } while (w[1] < s.length());
        return min;
    }

    private int findNext(String s, int[] w, int[] targetHash, int tl) {
        int[] hash = new int[targetHash.length];
        w[0]++;
        int cap = 0;
        while (w[0] < s.length() && targetHash[s.charAt(w[0]) - 'A'] == 0) {
            w[0]++;
        }
        if (w[0] == s.length()) return 0;
        //
        hash[s.charAt(w[0]) - 'A']++;
        cap++;
        w[1] = w[0] + 1;
        if (cap == tl) return 1;
        while (cap < tl && w[1] < s.length()) {
            int i = s.charAt(w[1]) - 'A';
            if (targetHash[i] > 0) {
                hash[i]++;
                cap++;
            }
            if (hash[i] > targetHash[i]) return 2;
            w[1]++;
        }
        return cap == tl ? 1 : 0;
    }

}
