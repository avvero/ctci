package pw.avvero.ctci.chapter5;

public class BitwiseConcater {
    public static int concat(int a, int b, int i, int j) {
        int mask = (1 << (j - i + 1)) - 1 << i;
        a = a & ~mask;
        return a + (b << i);
    }
}
