package pw.avvero.leet.year2024_01;

public class Problem714 {

    //   1  3  2  8 4 9
    //s  0  0  0  5 5 8
    //b -1 -1 -1 -1 1 0
    //w  0  0  0  0 5

    public int maxProfit(int[] prices, int fee) {
        int[] sell = new int[prices.length];
        int[] buy = new int[prices.length];
        int[] wait = new int[prices.length];
        buy[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sell[i] = Math.max(wait[i - 1], prices[i] + buy[i - 1] - fee);
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            wait[i] = Math.max(wait[i - 1], Math.max(sell[i - 1], buy[i - 1]));
        }
        return sell[prices.length - 1];
    }

}
