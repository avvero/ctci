package pw.avvero.ctci.chapter1;

import java.util.Arrays;

public class Chapter1Ex3 {

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] normalized1 = normalize(s1);
        char[] normalized2 = normalize(s2);
        return new String(normalized1).equalsIgnoreCase(new String(normalized2));
    }

    private static char[] normalize(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return chars;
    }
}
