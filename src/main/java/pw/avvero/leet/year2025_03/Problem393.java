package pw.avvero.leet.year2025_03;

import java.util.LinkedList;
import java.util.List;

public class Problem393 {

    // 10000000
    //
    public boolean validUtf8(int[] data) {
        int z = 1 << 7;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] & z) == 0) continue; // 1-byte
            int first = data[i];
            int n = 0;
            while ((first & z) == z) {
                n++;
                first = first << 1;
            }
            if (n > 4 || n == 1) return false; // incorrect length
            if (i + n - 1 >= data.length) return false; // overflow
            while (n-- > 1) { // skip first
                i++;
                if ((data[i] & z) == z && (data[i] << 1 & z) != z) {
                    // ok
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
