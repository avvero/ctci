package pw.avvero.leet.year2024_01;

import java.util.Arrays;

public class Problem188 {

    public int maxProfit(int k, int[] prices) {
        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];
        Arrays.fill(buy, -prices[0]);
        buy[0] = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                buy[j] = Math.max(buy[j], buy[j - 1] - prices[i]);
                sell[j] = Math.max(sell[j], sell[j - 1] + prices[i] + buy[j]);
            }
            int t = 1;
        }
        return sell[k];
    }

}
