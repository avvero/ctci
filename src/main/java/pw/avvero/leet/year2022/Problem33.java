package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.List;

public class Problem33 {
    public int search(int[] nums, int target) {
        int offset = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                offset = nums.length - i - 1;
                break;
            }
        }
        return search(nums, target, 0, nums.length - 1, offset);
    }

    private int search(int[] nums, int target, int s, int e, int offset) {
        if (s > e) return -1;
        int m = s + (e - s) / 2;
        int mo = m - offset;
        if (mo < 0) {
            mo = nums.length + mo;
        }
        if (nums[mo] > target) {
            return search(nums, target, s, m - 1, offset);
        } if (nums[mo] < target) {
            return search(nums, target, m + 1, e, offset);
        } else {
            return mo;
        }
    }
}
