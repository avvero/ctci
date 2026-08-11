package pw.avvero.leet.year2026_02;

public class Problem738 {

    public int monotoneIncreasingDigits(int n) {
        int size = 0;
        int ns = n;
        while (ns > 0) {
            size++;
            ns /= 10;
        }
        //
        int result = 0;
        while (n > 0) {
            int d1 = (int) (n / (Math.pow(10, size - 1)));
            int d2 = (int) (n - d1 * Math.pow(10, size - 1));
            if (size > 2) {
                int rm = (int) (n- Math.pow(10, size - 1) * d1);
                d2 = (int) (rm / (Math.pow(10, (size - 2))));
            }
            if (d1 <= d2) {
                int r = (int) (d1 * Math.pow(10, size - 1));
                result += r;
                n -= r;
                size--;
                if (size == 1) {
                    result += d2;
                    size--;
                    n = 0;
                }
            } else {
                if (d1 > 1) {
                    int r = (int) ((d1 - 1) * Math.pow(10, size - 1));
                    result += r;
                    size--;
                    while (size > 0) {
                        result += (int) (9 * Math.pow(10, size - 1));
                        size--;
                    }
                    break;
                } else {
                    size--;
                    while (size > 0) {
                        result += (int) (9 * Math.pow(10, size - 1));
                        size--;
                    }
                    break;
                }
            }
        }
        return result;
    }
}
