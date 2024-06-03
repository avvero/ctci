package pw.avvero.leet.year2024_05;

public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int low1 = 0, hi1 = nums1.length - 1, low2 = 0, hi2 = nums2.length - 1;
        while(low1 < hi1 && low2 < hi2) {
            int m1 = low1 + (hi1 - low1) / 2;
            int m2 = low2 + (hi2 - low2) / 2;
            if (nums1[m1] < nums2[m2]) {
                low1 = m1;
                hi2 = m2;
            } else {
                low2 = m2;
                hi1 = m1;
            }
        }
        return nums1[low1];
    }

}
