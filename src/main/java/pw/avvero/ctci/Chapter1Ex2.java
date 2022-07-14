package pw.avvero.ctci;

public class Chapter1Ex2 {

    public static String reverse(String value) {
        char[] chars = value.toCharArray();
        char[] reversed = new char[chars.length];
        int lastIndex = chars.length -1;
        for (int i = 0; i <= lastIndex; i++) {
            reversed[lastIndex - i] = chars[i];
        }
        return new String(reversed);
    }
}
