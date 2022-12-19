package pw.avvero.leet;

public class Problem6 {
    // 1 + 6 = 7
    // 7 - (1 * 2) = 5
    // 7 + 6 = 13
    // 13 - (1 * 2) = 11

    // 2 + 6 = 8
    // 8 - (2 * 2) = 4

    // 3 + 6 = 9
    // 9 - (3 * 2) = 3
    // 9 + 6 = 15
    // 9 - (3 * 2) = 3

    // ABCDE 4

    // A
    // B
    // C E
    // D

    // 1
    // 1 + 6 = 7
    // 7 - 1 * 2 = 5

    //2
    //2 + 6 = 8
    //8 - (2 * 2) = 4

    public String convert(String s, int numRows) {
        char[] source = s.toCharArray();
        char[] target = s.toCharArray();
        int c = 2 * numRows - 2;
        int i = 0;
        for (int r = 0; r < numRows ; r++) {
            for (int j = r; j < target.length && i < target.length;) {
                target[i++] = source[j];

                int n = j + c;
                int p = n - (r * 2);
                if (p >= target.length) break;
                if (p == 0 || p % c == 0 || p == j) {
                    j = n;
                    continue;
                } else if (i < target.length && p < target.length ) {
                    // back step
                    target[i++] = source[p];
                    j = n;
                }
            }
        }
        return new String(target);
    }
}
