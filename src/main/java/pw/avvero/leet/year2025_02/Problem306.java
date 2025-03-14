package pw.avvero.leet.year2025_02;

public class Problem306 {

    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        if (n < 3) return false;
        for (int i = 0; i < n / 3 + 1; i++) {
            long n1 = Long.valueOf(num.substring(0, i + 1));
            for (int j = i + 1; j < (n - n / 3); j++) {
                long n2 = Long.valueOf(num.substring(i + 1, j + 1));
                boolean result = isAdditiveNumber(num, j + 1, n1, n2);
                if (result) return true;
            }
        }
        return false;
    }

    private boolean isAdditiveNumber(String num, int s, long n1, long n2) {
        for (int i = s; i < num.length(); i++) {
            String sub = num.substring(s, i + 1);
            if (sub.startsWith("0")) continue;
            long n = Long.valueOf(sub);
            if (n1 + n2 == n) {
                if (i + 1 >= num.length()) return true;
                return isAdditiveNumber(num, i + 1, n2, n);
            } else if (n1 + n2 < n) {
                return false;
            }
        }
        return false;
    }
}
