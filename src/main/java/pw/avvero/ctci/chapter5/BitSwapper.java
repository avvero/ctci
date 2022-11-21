package pw.avvero.ctci.chapter5;

public class BitSwapper {
    public static String swap(String s) {
        int n = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[chars.length - 1 - i];
            n += (1 << i) * (c == '1' ? 1 : 0);
        }
        // 170 = 10101010
        n = (n << 1 & 170) | (n >> 1 & 85);
        //
        if (n == 0) {
            return "00000000";
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            if (n == 1) {
                sb.append(1);
                n = 0;
            } else {
                int rm = n % 2;
                sb.append(rm == 1 ? 1 : 0);
                n = n / 2;
            }
        }
        while (sb.length() < s.length()) {
            sb.append("0");
        }
        return sb.reverse().toString();
    }
}
