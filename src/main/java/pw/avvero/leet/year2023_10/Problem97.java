package pw.avvero.leet.year2023_10;

import java.util.Arrays;

public class Problem97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        return isInterleave(s1.toCharArray(), 0, s2.toCharArray(), 0, s3.toCharArray(), 0);
    }

    public boolean isInterleave(char[] s1, int s1i,  char[] s2, int s2i, char[] s3, int s3i) {
        if (s1i == s1.length && s2i == s2.length && s3i == s3.length) return true;
        if (s1i == s1.length || s2i == s2.length || s3i == s3.length) return false;

        if (s1[s1i] == s3[s3i] && s2[s2i] == s3[s3i]) {
            boolean result = isInterleave(s1, s1i, s2, s2i + 1, s3, s3i + 1);
            if (result) {
                return result;
            } else {
                return isInterleave(s1, s1i + 1, s2, s2i, s3, s3i + 1);
            }
        }
        if (s1[s1i] == s3[s3i]) {
            return isInterleave(s1, s1i + 1, s2, s2i, s3, s3i + 1);
        }
        if (s2[s2i] == s3[s3i]) {
            return isInterleave(s1, s1i, s2, s2i + 1, s3, s3i + 1);
        }
        return false;
    }
}
