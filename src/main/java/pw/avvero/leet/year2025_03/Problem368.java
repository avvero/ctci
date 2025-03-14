package pw.avvero.leet.year2025_03;

import java.util.*;

public class Problem368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        return traverse(nums, 0, new ArrayList<>(), List.of());
    }

    private List<Integer> traverse(int[] nums, int s, List<Integer> entry, List<Integer> max) {
        if (entry.size() > max.size()) {
            max = new ArrayList<>(entry);
        }
        for (int i = s; i < nums.length; i++) {
            if (entry.size() > 0) {
                int last = entry.get(entry.size() - 1);
                if (nums[i] / last == 0 || nums[i] % last == 0) {
                    entry.add(nums[i]);
                    max = traverse(nums, i + 1, entry, max);
                    entry.remove(entry.size() - 1);
                }
            } else {
                entry.add(nums[i]);
                max = traverse(nums, i + 1, entry, max);
                entry.remove(entry.size() - 1);
            }
        }
        return max;
    }
}
