package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem121 {

    public int maxProfit(int[] prices) {
        int[] min = new int[10000];
        int[] max = new int[10000];
        int maxi = 0;
        int p = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int v = prices[i];

            if (min[v] == 0) {
                min[v] = i;
            } else if (min[v] > i) {
                min[v] = i;
            }
            if (max[v] < i) {
                max[v] = i;
                maxi = Math.max(maxi, v);
            }
        }
        for (int i = 0, j = maxi; i < j;) {
            if (min[i] != 0 && min[i] < max[j]) {
                return i - j;
            }
            i++;
            if (min[i] != 0 && min[i] < max[j]) {
                return j - i;
            }
            j--;
        }
        return p;
    }
}
