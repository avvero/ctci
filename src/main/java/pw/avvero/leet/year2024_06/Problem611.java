package pw.avvero.leet.year2024_06;

import java.util.Arrays;

public class Problem611 {

    public int triangleNumber(int[] nums) {
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int n = 0;
        for (int a = 0; a < nums.length - 2; a++) {
            for (int b = a + 1; b < nums.length - 1; b++) {
                int min = searchMoreThan(nums, b + 1, nums.length - 1, nums[b] + 1);
                int max = searchLessThan(nums, b + 1, nums.length - 1, nums[a] + nums[b] + 1);
                if (max - min >= 0) {
                    n = n + (max - min + 1);
                }
            }
        }
        return n;
    }

    private boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && c + b > a;
    }

    private int searchMoreThan(int[] nums, int low, int hi, int min) {
        if (low > hi) return -1;
        int m = low + (hi - low) / 2;
        if (nums[m] == min) {
            return m;
        } else if (nums[m] < min) {
            return searchMoreThan(nums, m + 1, hi, min);
        } else {
            int next = searchMoreThan(nums, low, m - 1, min);
            return next != -1 ? next : m;
        }
    }

    private int searchLessThan(int[] nums, int low, int hi, int max) {
        if (low > hi) return -1;
        int m = low + (hi - low) / 2;
        if (nums[m] == max) {
            return m;
        } else if (nums[m] < max) {
            int next = searchMoreThan(nums, m + 1, hi, max);
            return next != -1 ? next: m;
        } else {
            return searchMoreThan(nums, low, m - 1, max);
        }
    }

}
