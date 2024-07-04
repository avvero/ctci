package pw.avvero.leet.year2023.year2023_06;

import java.util.LinkedList;

public class Problem76 {

    // ADOBECODEBANC
    // ADOBEC
    // BECODEBA
    // BANC

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        int l = 0;
        int r = 0;
        int index = 0;
        int minLength = Integer.MAX_VALUE;
        int[] map = new int[128];
        int count = t.length();
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] sArray = s.toCharArray();
        while (r < sArray.length) {
            if (map[ sArray[r++] ]-- > 0) {
                count--;
            }
            while (count == 0) {
                if ((r - l) < minLength) {
                    minLength = r - l;
                    index = l;
                }
                if (map[ sArray[l++] ]++ == 0) {
                    count++;
                }
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return new String();
        }

        return new String(sArray, index, minLength);
    }

}
