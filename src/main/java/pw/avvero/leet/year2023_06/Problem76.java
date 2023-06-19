package pw.avvero.leet.year2023_06;

import java.util.LinkedList;

public class Problem76 {

    // ADOBECODEBANC
    // ADOBEC
    // BECODEBA
    // BANC

    public String minWindow(String s, String t) {
        String result = "";
        //
        int[] targetHash = new int[64];
        int targetCap = 0;
        for (int i = 0; i < t.length(); i++) {
            targetHash[hash(t.charAt(i))]++;
            targetCap++;
        }
        int[] hash = new int[64];
        int cap = 0;
        int i = 0, j = 0;
        LinkedList<Integer> iz = new LinkedList<>();
        while (j < s.length()) {
            int h = hash(s.charAt(j));
            if (targetHash[h] > 0) {
                if (hash[h] < targetHash[h]) {
                    cap++;
                }
                hash[h]++;
                if (j > 0) {
                    iz.add(j);
                }
            }
            if (targetCap == cap) {
                String nextResult = s.substring(i, j + 1);
                if (nextResult.length() == t.length()) return nextResult;
                if (result.equals("")  || nextResult.length() < result.length()) {
                    result = nextResult;
                }
                int f = hash(s.charAt(i));
                if (hash[f] > 0) {
                    hash[f]--;
                    if (hash[f] < targetHash[f]) {
                        cap--;
                        j++;
                    } else { // first char is redundant, step back
                        hash[h]--;
                        cap--;
                    }
                } else { // first char is redundant, step back
                    hash[h]--;
                    cap--;
                }
                if (!iz.isEmpty()) {
                    int nexti;
                    do {
                        nexti = iz.removeFirst();
                    } while(i == nexti && !iz.isEmpty());
                    i = nexti;
                }
            } else {
                j++;
            }
        }
        return result;
    }

    private int hash(char c) {
        return c - 'A';
    }

}
