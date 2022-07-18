package pw.avvero.ctci;

public class Chapter1Ex8 {

    public static boolean isSubstring(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        for (int i = 0; i < s1Chars.length; i++) {
            int li = i;
            int matched = 0;
            for (int j = 0; j < s2Chars.length; j++) {
                if (li < s1Chars.length && s1Chars[li] == s2Chars[j]) {
                    ++matched;
                    li++;
                    if (li == s1Chars.length) {
                        li = 0;
                    }
                }
            }
            if (matched == s2Chars.length) return true;
        }
        return false;
    }
}
