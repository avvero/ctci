package pw.avvero.leet.year2026_02;

import java.util.TreeSet;

public class Problem795 {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int result = 0;
        TreeSet<Integer> set = new TreeSet<>();
        int i = 0, j = 0;
        while (i < nums.length) {
            set.add(nums[i]);
            if (set.last() >= left && set.last() <= right) {
                result++;
                i++;
            } else {
                while (j <= i) {
                    set.remove(nums[j]);
                        if (!set.isEmpty() && set.last() >= left && set.last() <= right) {
                        result++;
                    }
                    j++;
                }
                i++;
            }
        }
        return result;
    }
}
