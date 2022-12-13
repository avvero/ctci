package pw.avvero.leet;

public class Problem191 {

    // you need to treat n as an unsigned value
    // 01111111111111111111111111111111 - 2147483648
    // 11111111111111111111111111111101 - -3
    // 01111111111111111111111111111101 - 2147483645
    public int hammingWeight(int n) {
        int result = 0;
        while (n < 0) {
            int r = n % 2;
            if (r == -1) {
                result ++;
            }
            n = n >> 1;
        }
        return ones(n);
    }

    private int ones(int n) {
        int result = 0;
        while (n != 0) {
            if (n < 2) {
                result++;
                break;
            }
            int r = n % 2;
            if (r == 1) {
                result++;
            }
            n = n / 2;
        }
        return result;
    }

}
