package pw.avvero.leet;

public class Problem29 {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

        int result = 0;
        int s1 = dividend < 0 ? -1 : 1;
        int s2 = divisor < 0 ? -1 : 1;
        int s = s1 != s2 ? -1: 1;

        int r = 0;
        if (dividend == Integer.MIN_VALUE) {
            r = Math.abs(divisor);
            dividend = dividend + r;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (divisor > dividend && r == 0) return 0;

        int b = 1;
        while (b <= 31 && divisor << b < dividend && divisor << b > 0) {
            b++;
        }

        for (int i = b; i >= 0; i--) {
            int sh = divisor << i;
            if (sh > 0 && sh <= dividend && sh >= divisor) {
                dividend -= sh;
                result += 1 << i;
            }
        }
        if (r != 0) {
            result++;
        }
        return s > 0 ? result : -result;
    }
}
