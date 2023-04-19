package pw.avvero.leet.year2023_04;

import java.util.Arrays;

public class Problem322 {

    public int coinChange(int[] coins, int amount) {
        return change(coins, amount, new int[amount + 1]);
    }

    private int change(int[] coins, int amount, int[] cache) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (cache[amount] != 0) {
            return cache[amount];
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int mResult = change(coins, amount - coins[i], cache);
            if (mResult >= 0) {
                result = Math.min(result, 1 + mResult);
            }
        }
        result = result == Integer.MAX_VALUE ? -1 : result;
        cache[amount] = result;
        return result;
    }
}
