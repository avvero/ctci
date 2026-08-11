package pw.avvero.leet.year2026_02;

public class Problem769 {

    public int maxChunksToSorted(int[] arr) {
        int[] pos = new int[10 + 1];
        for (int i = 0; i < arr.length; i++) {
            pos[arr[i]] = i;
        }
        int chunks = 0;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i == end && arr[i] < end) {
                chunks++;
                end = -1;
            } else if (end == -1 && i == arr[i]) {
                chunks++;
            } else {
                end = Math.max(end, arr[i]);
            }
        }
        return chunks;
    }
}
