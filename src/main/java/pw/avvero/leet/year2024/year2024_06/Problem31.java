package pw.avvero.leet.year2024.year2024_06;

import java.util.Arrays;

public class Problem31 {

    public void nextPermutation(int[] nums) {
        for (int j = nums.length - 1; j > 0; j--) {
            for (int i = j - 1; i >= 0; i--) {
                if (nums[j] > nums[i]) {
                    // swap
                    int oldj = nums[j];
                    nums[j] = nums[i];
                    nums[i] = oldj;
                    // sort from i + 1
                    Arrays.sort(nums, i + 1, nums.length);
                    return;
                }
            }
        }
        Arrays.sort(nums, 0, nums.length);
    }
}
