package pw.avvero.leet.year2023_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem188 {
    public int maxProfit(int k, int[] prices) {
        int[][] profit = new int[k + 1][prices.length];
        for (int j = 1; j <= k; j++) {
            int loss = profit[j - 1][0]-prices[0];
            for (int i = 1; i < prices.length; i++) {
                loss = Math.max(loss, profit[j - 1][i] -prices[i]);
                profit[j][i] = Math.max(profit[j][i - 1], loss + prices[i]);
            }
        }
        return profit[k][prices.length - 1];
    }
}
