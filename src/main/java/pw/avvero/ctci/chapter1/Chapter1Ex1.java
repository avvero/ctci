package pw.avvero.ctci.chapter1;

import java.util.Arrays;

public class Chapter1Ex1 {

    public static boolean hasUniqueOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j) continue;
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }

    public static boolean hasUniqueOnly2(String s) {
        boolean[] chars = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chars[chr]) {
                return false;
            }
            chars[chr] = true;
        }
        return true;
    }

    public static boolean hasUniqueOnly3(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) return false;
        }
        return true;
    }

}
