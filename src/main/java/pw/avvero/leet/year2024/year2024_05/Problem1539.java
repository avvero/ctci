package pw.avvero.leet.year2024.year2024_05;

import java.util.Arrays;

public class Problem1539 {

    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > 1) {
            int diff = arr[0] - 1;
            if (diff >= k) {
                return k;
            } else {
                k -= diff;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i] - 1;
            if (diff == 0) continue;
            if (diff == k) {
                return arr[i] + k;
            } else if (diff <= k) {
                k -= diff;
            } else {
                return arr[i] + k;
            }
        }
        return arr[arr.length - 1] + k;
    }

}
