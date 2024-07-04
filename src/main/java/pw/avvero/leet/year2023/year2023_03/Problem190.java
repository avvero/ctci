package pw.avvero.leet.year2023.year2023_03;

import java.util.HashMap;

public class Problem190 {

    public int reverseBits(int n) {
        int result = 0;
        while (n != 0) {
            int b = n & 1;
            result = result | b;
            n = n >> 1;
            if (n != 0) {
                result = result << 1;
            }
        }
        return result;
    }
}
