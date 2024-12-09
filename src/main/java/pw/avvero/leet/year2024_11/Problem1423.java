package pw.avvero.leet.year2024_11;

public class Problem1423 {

    public int maxScore(int[] cards, int k) {
        int[] left = new int[cards.length + 1];
        int[] right = new int[cards.length + 1];
        for (int i = 0; i < cards.length; i++) {
            left[i + 1] = left[i] + cards[i];
        }
        for (int i = cards.length - 1; i >= 0; i--) {
            right[i] = right[i + 1] + cards[i];
        }
        int i = k, j = k;
        while (i + j > k) {
            if (left[i] - left[i - 1] < right[j] - right[j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return left[i] + right[j];
    }
}
