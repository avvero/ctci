package pw.avvero.leet.year2023_03;

public class Problem215_2 {

    public int findKthLargest(int[] nums, int k) {
        return select(nums, 0, nums.length - 1, nums.length - k);
    }

    private int select(int[] nums, int start, int end, int k) {
        int pivotLoc = partition(nums, start, end);
        if (pivotLoc == k) return nums[pivotLoc];
        if (pivotLoc < k) {
            return select(nums, pivotLoc + 1, end, k);
        } else {
            return select(nums, start, pivotLoc - 1, k);
        }
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = nums[start];
        int pivotLoc = end;
        for (int i = end; i >= start; i--) {
            if (nums[i] > pivot) {
                int temp = nums[i];
                nums[i] = nums[pivotLoc];
                nums[pivotLoc] = temp;
                pivotLoc--;
            }
        }
        int temp = nums[pivotLoc];
        nums[pivotLoc] = pivot;
        nums[start] = temp;
        return pivotLoc;
    }
    // [3,2,1,5,6,4] 3, 0
    // [3,2,1,5,6,4] 3, 0
}
