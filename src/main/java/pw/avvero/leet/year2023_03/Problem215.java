package pw.avvero.leet.year2023_03;

import java.util.Arrays;

public class Problem215 {

    public int findKthLargest(int[] nums, int k) {
        int[] largest = new int[k];
        Arrays.fill(largest, Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
            push(nums[i], largest, 0);
        }
        return largest[k - 1];
    }

    private void push(int max, int[] largest, int i) {
        if (i == largest.length) return;
        if (largest[largest.length - 1] > max) return;
        if (max > largest[i]) {
            int prev = largest[i];
            largest[i] = max;
            push(prev, largest, ++i);
        } else {
            push(max, largest, ++i);
        }
    }

    // [3,2,1,5,6,4]
    // [1,2,3,4,5,6]
}
