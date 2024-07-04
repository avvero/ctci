package pw.avvero.leet.year2023.year2023_12;

import java.util.Arrays;

public class Problem673 {

    public int findNumberOfLIS(int[] nums) {
        int[] length = new int[nums.length];
        Arrays.fill(length, 1);
        int max = 1;
        int[] count = new int[nums.length];
        Arrays.fill(count, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    if (length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    } else if (length[j] + 1 == length[i]) {
                        count[i] += count[j];
                    }
                }
            }
            max = Math.max(max, length[i]);
        }
        int maxCount = 0;
        for (int i = 0; i < length.length; i++) {
            if (max == length[i]) {
                maxCount += count[i];
            }
        }
        return maxCount;
    }
}
