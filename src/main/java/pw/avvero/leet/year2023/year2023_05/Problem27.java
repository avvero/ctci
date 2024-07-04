package pw.avvero.leet.year2023.year2023_05;

public class Problem27 {

    public int removeElement(int[] nums, int val) {
        int result = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
                result++;
            }
        }
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
        return result;
    }

}
