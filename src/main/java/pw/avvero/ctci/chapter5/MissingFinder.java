package pw.avvero.ctci.chapter5;

import java.util.stream.IntStream;

public class MissingFinder {

    /**
     * 0 - 00000000
     * 1 - 00000001
     * 2 - 00000010
     * 3 - 00000011
     * 4 - 00000100
     * 5 - 00000101
     * 6 - 00000110
     * 7 - 00000111
     * 8 - 00001000
     * 9 - 00001001
     *
     * @param array
     * @param n
     * @return
     */

    public static Integer find(int[] array, int n) {
        return 0;
    }

    public static Integer findDumb(int[] array, int n) {
        return IntStream.range(0, n).sum() - IntStream.of(array).sum();
    }

}
