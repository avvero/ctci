package pw.avvero.leet.year2023_10;

public class Problem123 {

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 1) return 0;
        int loss = -prices[0], profit = 0, loss2 = -prices[0], profit2 = 0;
        for (int i = 1; i < prices.length; i++) {
            loss = Math.max(loss, -prices[i]);
            profit = Math.max(profit, prices[i] + loss);
            loss2 = Math.max(loss2, profit - prices[i]);
            profit2 = Math.max(profit2, prices[i] + loss2);
        }
        return profit2;
    }
}
