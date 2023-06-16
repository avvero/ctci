package pw.avvero.leet.year2023_06;

import java.util.ArrayList;
import java.util.List;

public class Problem1318 {

    //  0010
    //  0110
    //= 0101

    //  0100
    public int minFlips(int a, int b, int c) {
        int result = 0;
        int i = 1 << 10;
        while (i > 0) {
            int ic = i & c;
            if (ic > 0) {
                if ((ic & a) + (ic & b) > ic) {
                    result++;
                }
                if ((ic & a) + (ic & b) == 0) {
                    result++;
                }
            }
            i = i >> 1;
        }
        return result;
    }

}
