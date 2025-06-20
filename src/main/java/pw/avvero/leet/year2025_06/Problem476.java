package pw.avvero.leet.year2025_06;

public class Problem476 {

    public int findComplement(int num) {
        int m = 1;
        int original = num;
        while (m <= original) {
            if ((m & num) == m) {
                num = num ^ m;
            } else {
                num = num | m;
            }
            m = m << 1;
        }
        return num;
    }
}
