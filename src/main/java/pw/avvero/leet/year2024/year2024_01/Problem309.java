package pw.avvero.leet.year2024.year2024_01;

public class Problem309 {

    public int maxProfit(int[] prices) {
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        int[] rest = new int[prices.length];
        buy[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy[i] = Math.max(buy[i - 1], rest[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
            rest[i] = Math.max(rest[i - 1], Math.max(sell[i - 1], buy[i - 1]));
        }
        return sell[prices.length - 1];
    }

}
