package pw.avvero.leet.year2023.year2023_04;

import java.util.Arrays;
import java.util.Comparator;

public class Problem322 {

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                int r = i % coin;
                int d = i / coin;
                if (r == 0) {
                    dp[i] = dp[i] == 0 ? d : Math.min(dp[i], d);
                } else if (dp[r] > 0) {
                    dp[i] = dp[i] == 0 ? d + dp[r] : Math.min(dp[i], d + dp[r]);
                }
            }
        }
        return dp[amount] > 0 ? dp[amount] : -1;
    }
}
