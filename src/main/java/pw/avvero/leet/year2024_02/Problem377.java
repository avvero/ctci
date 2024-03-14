package pw.avvero.leet.year2024_02;

import java.util.Arrays;

public class Problem377 {

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int n : nums) {
            for (int i = n; i <= target; i++) {
                if (i == n) {
                    dp[i] = dp[i] + dp[i - n];
                } else {
                    dp[i] = dp[i] + dp[i - n] * dp[n];
                }

            }
        }
        return dp[target];
    }

}
