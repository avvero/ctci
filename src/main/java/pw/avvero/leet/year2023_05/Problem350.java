package pw.avvero.leet.year2023_05;

import java.util.Arrays;

public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] big = nums1;
        int[] small = nums2;
        if (nums1.length < nums2.length) {
            big = nums2;
            small = nums1;
        }
        int s = 0;
        int e = 0;
        int[] result = new int[]{};
        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < small.length; j++) {
                if (big[i] == small[j]) {
                    s = i;
                    e = i;
                    while(e < big.length && j < small.length && big[e] == small[j]) {
                        e++;
                        j++;
                    }
                    int[] candidate = Arrays.copyOfRange(big, s, e + 1);
                    result = candidate.length > result.length ? candidate : result;
                    break;
                }
            }
        }
        return result;
    }
}
