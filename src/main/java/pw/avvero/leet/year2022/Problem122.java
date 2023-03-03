package pw.avvero.leet.year2022;

public class Problem122 {

    int[] cache = new int[100000];

    public int maxProfit(int[] prices) {
        return maxProfit(prices, 0);
    }

    private int maxProfit(int[] prices, int s) {
        if (cache[s] != 0) return cache[s];

        if (s == prices.length) return 0;
        int buy = prices[s];
        int profit = 0;
        for (int i = s; i < prices.length; i++) {
            if (prices[i] == 0) continue;
            if (prices[i] == buy) continue;
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                int value = prices[i] - buy + maxProfit(prices, i + 1);
                profit = Math.max(profit, value);
            }
        }
        cache[s] = profit;
        return profit;
    }
}
