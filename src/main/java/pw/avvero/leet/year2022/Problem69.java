package pw.avvero.leet.year2022;

public class Problem69 {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int y = x;
        int z = (y + x/y) / 2;
        while (z < 0) {
            z = 46340;
        }
        while (y - z > 0) {
            y = z;
            z = (y + x/y) / 2;
        }
        return z * z <= x ? z : z - 1;
    }
}
