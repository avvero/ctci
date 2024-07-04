package pw.avvero.leet.year2023.year2023_04;

import java.util.Arrays;

public class Problem324 {

    // 1,3,2,2,3,1
    // 1,3,2,3,2,1

    public void wiggleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (!inPlace(nums, i)) {
                boolean odd = i % 2 == 1;
                int j = i;
                while (j < nums.length && (odd ? nums[i] <= nums[j] : nums[i] >= nums[j])) {
                    j++;
                }
                int b = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = b;
            } else {
                i++;
            }
        }
    }

    private boolean inPlace(int[] nums, int i) {
        if (i == 0 && nums[i] < nums[i + 1]) return true;
        if (i == nums.length - 1) return true;
        if (i % 2 == 1) {
            return nums[i - 1] < nums[i] && nums[i] > nums[i + 1];
        } else {
            return nums[i - 1] > nums[i] && nums[i] < nums[i + 1];
        }
    }
}
