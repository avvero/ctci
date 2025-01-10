package pw.avvero.leet.year2024.year2024_05;

import java.util.Arrays;

public class Problem852 {

    public int peakIndexInMountainArray(int[] arr) {
        int low = 1, hi = arr.length - 2;
        while (low <= hi) {
            int m = low + (hi - low) / 2;
            if (arr[m - 1] < arr[m] && arr[m] > arr[m + 1]) {
                return m;
            } else if (arr[m - 1] > m) {
                hi = m - 1;
            } else {
                low = m + 1;
            }
        }
        return low;
    }

}
