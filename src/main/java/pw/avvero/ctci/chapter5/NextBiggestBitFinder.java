package pw.avvero.ctci.chapter5;

public class NextBiggestBitFinder {
    public static int search(int i) {
        int n = 0;
        int ni = 7;
        while (i != 0) {
            if (i == 1) {
                i = 0;
                n = n + (1 << ni);
            } else {
                int rm = i % 2;
                if (rm == 1) {
                    n = n + (1 << ni);
                    ni --;
                }
                i = i / 2;
            }
        }
        return n;
    }
}
