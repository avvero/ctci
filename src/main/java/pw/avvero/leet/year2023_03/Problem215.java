package pw.avvero.leet.year2023_03;

import java.util.Arrays;

public class Problem215 {

    public int findKthLargest(int[] nums, int k) {
        return select(nums, 0, nums.length - 1, k - 1);
    }

    private int select(int[] nums, int left, int right, int k) {
        int pivotLoc = partition(nums, left, right);
        if (pivotLoc == k) return nums[k];
        if (pivotLoc < k) {
            return select(nums, pivotLoc + 1, right, k);
        } else {
            return select(nums, left, pivotLoc - 1, k);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int pivotLoc = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] < pivot) {
                int temp = nums[i];
                nums[i] = nums[pivotLoc];
                nums[pivotLoc] = temp;
                pivotLoc++;
            }
        }
        int temp = nums[right];
        nums[right] = nums[pivotLoc];
        nums[pivotLoc] = temp;
        return pivotLoc;
    }
    //  7, 10, 4, 3, 20, 15
    // 10,  7, 4, 3, 20, 15
}
