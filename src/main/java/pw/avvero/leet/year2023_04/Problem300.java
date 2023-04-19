package pw.avvero.leet.year2023_04;

import java.util.Arrays;

public class Problem300 {

    public int lengthOfLIS(int[] nums) {
        int result = 1;
        int[] weight = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            weight[i] = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    weight[i] = Math.max(weight[i], weight[j] + 1);
                    result = Math.max(result, weight[i]);
                }
            }
        }
        return result;
    }

    public int lengthOfLIS2(int[] nums) {
        int result = 1;
        int[] piles = new int[nums.length + 1];
        int len = 0;
        for (int x : nums) {
            int pile = Arrays.binarySearch(piles, 0, len, x);
            if(pile < 0) pile = -(pile + 1);
            piles[pile] = x;
            if(pile == len) len++;
        }
        return len;
    }
}
