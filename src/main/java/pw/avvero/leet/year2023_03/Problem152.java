package pw.avvero.leet.year2023_03;

public class Problem152 {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, currMax = 1;
        for (int i = 0; i < nums.length; ++i) {
            currMax *= nums[i];
            if (currMax > max) max = currMax;
            if (currMax == 0) {
                currMax = 1;
            }
        }
        currMax = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            currMax *= nums[i];
            if (currMax > max) max = currMax;
            if (currMax == 0) {
                currMax = 1;
            }
        }
        return max;
    }

}
