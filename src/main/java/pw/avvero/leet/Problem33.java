package pw.avvero.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem33 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        return search(nums, 0, nums.length - 1, target);
    }
    private int search(int[] nums, int s, int e, int target) {
        if (nums[s] == target) return s;
        if (nums[e] == target) return e;
        if (e - s <= 1) return -1;
        int p = s + (e - s) / 2;
        if (nums[p] == target) return p;

        if (target > nums[s] && target > nums[p]) {
            return search(nums, p, e, target);
        } else if (target > nums[s]) {
            return search(nums, s, p, target);
        } else {
            return search(nums, p, e, target);
        }
    }
}
