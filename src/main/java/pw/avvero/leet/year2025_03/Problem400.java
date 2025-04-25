package pw.avvero.leet.year2025_03;

public class Problem400 {

    public int findNthDigit(int n) {
        int l = 1, s = 0, e = 0;
        while (n > 0) {
            s = (int) Math.pow(10, l - 1);
            e = (int) Math.pow(10, l) - 1;
            int ds = e - s + 1;
            for (int i = 0; i < ds; i = i + l) {
                if (n - l <= 0) {
                    return Long.valueOf(s + (i / l)).toString().charAt(n - 1) - '0';
                }
                n -= l;
            }
            l++;
        }
        return -1;
    }
}
