package pw.avvero.leet.year2024_01;

public class Problem714 {

    public int maxProfit(int[] prices, int fee) {
        int[] dp = new int[prices.length + 1];
        for (int i = 1; i < prices.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int profitSoFar = Math.max(dp[i], prices[i] - prices[j] - fee + dp[j + 1]);
                dp[i + 1] = Math.max(dp[i + 1], profitSoFar);
            }
        }
        return dp[prices.length];
    }

}
