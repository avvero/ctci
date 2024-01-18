package pw.avvero.leet.year2024_01;

public class Problem123 {

    //    3  3  5 0 0 3  1 4
    //s   0  0  0 0 0 3  3 4
    //b  -3 -3 -3 0 0 0  0 0
    //s2  0  0  0 0 0 3  3 6
    //b2  0  0  0 0 0 0 -1 0

    public int maxProfit(int[] prices) {
        int sell = 0, sell2 = 0;
        int buy = -prices[0], buy2 = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, -prices[i]);
            sell = Math.max(sell, prices[i] + buy);
            buy2 = Math.max(buy2, sell - prices[i]);
            sell2 = Math.max(sell2, prices[i] + buy2);
        }
        return sell2;
    }

}
