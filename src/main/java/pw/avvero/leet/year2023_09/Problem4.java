package pw.avvero.leet.year2023_09;

public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = merge(nums1, nums2);
        int mid = result.length / 2;
        if (result.length % 2 == 1) {
            return result[mid];
        } else {
            return (double) (result[mid - 1] + result[mid]) / 2;
        }
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i1 = 0;
        int i2 = 0;
        int ir = 0;
        while(i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] < nums2[i2]) {
                result[ir++] = nums1[i1++];
            } else {
                result[ir++] = nums2[i2++];
            }
        }
        while(i1 < nums1.length) {
            result[ir++] = nums1[i1++];
        }
        while(i2 < nums2.length) {
            result[ir++] = nums2[i2++];
        }
        return result;
    }
}
