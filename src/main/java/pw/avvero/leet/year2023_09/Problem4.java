package pw.avvero.leet.year2023_09;

public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int[] range = new int[]{0, 0};
        merge(nums1, nums2, result, range);
        int mid = (range[1] - range[0]) / 2;
        if ((range[1] - range[0]) % 2 == 0) {
            return result[mid];
        } else {
            return (double) (result[mid] + result[mid + 1]) / 2;
        }
    }

    private void merge(int[] nums1, int[] nums2, int[] result, int[] range) {
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
        range[1] = --ir;
    }
}
