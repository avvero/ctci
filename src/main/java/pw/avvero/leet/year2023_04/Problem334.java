package pw.avvero.leet.year2023_04;

public class Problem334 {

    public boolean increasingTriplet(int[] nums) {
        return moreThan(nums, 0, Integer.MIN_VALUE) > 2;
    }

    private int moreThan(int[] nums, int s, int val) {
        for (int i = s; i < nums.length; i++) {
            if (nums[i] > val) {
                int result = 1 + moreThan(nums, i + 1, nums[i]);
                if (result > 2) return result;
            }
        }
        return 0;
    }
}
