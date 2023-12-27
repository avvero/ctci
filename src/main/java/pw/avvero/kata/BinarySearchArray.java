package pw.avvero.kata;

public class BinarySearchArray {

    public int search(int[] arr, int target) {
        return search(arr, 0, arr.length, target);
    }

    public int search(int[] arr, int left, int right, int target) {
        int low = left;
        int high = right - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midValue = arr[mid];
            if (midValue < target) {
                low = mid + 1;
            } else if (midValue > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

}
