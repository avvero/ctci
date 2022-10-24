package pw.avvero.ctci.chapter5;

public class BitComparator {

    /**
     * 31 - 11111
     * 14 - 01110
     * = 2
     *
     * @param one
     * @param two
     * @return
     */
    public static int diff(int one, int two) {
        int df = one ^ two;
        int n = 0;
        while (df != 0) {
            if (df == 1) {
                n++;
                df = 0;
            } else {
                int rm = df % 2;
                if (rm == 1) {
                    n++;
                }
                df = df / 2;
            }
        }
        return n;
    }

    public static int diff2(int one, int two) {
        int n = 0;
        for (int c = one ^ two; c > 0; c = c >> 1) {
            n += c & 1;
        }
        return n;
    }
}
