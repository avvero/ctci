package pw.avvero.leet.year2024_07;

public class Problem151 {

    public String reverseWords(String string) {
        char[] source = string.toCharArray();
        char[] result = new char[source.length];
        int r = 0, ws = -1, we = -1;
        for (int s = source.length - 1; s >= 0; s--) {
            if (source[s] == ' ') {
                if (ws != -1) {
                    r = copy(source, ws, we, result, r);
                }
                we = -1;
                ws = -1;
            } else if (we == -1) {
                we = s;
                result[r++] = ' ';
            } else {
                ws = s;
                if (s == 0) {
                    copy(source, ws, we, result, r);
                }
            }
        }
        return new String(result);
    }

    private int copy(char[] source, int ws, int we, char[] dest, int r) {
        for (int i = ws; i <= we; i++) {
            dest[r++] = source[i];
        }
        return r;
    }
}
