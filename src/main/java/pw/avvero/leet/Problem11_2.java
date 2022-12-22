package pw.avvero.leet;

public class Problem11_2 {
    public int maxArea(int[] height) {
        int[] result = new int[1];
        int[] cache = new int[height.length];
        maxArea(height, result, 0, 1, cache);
        return result[0];
    }

    private void maxArea(int[] height, int[]result, int s, int e, int[] cache) {
        System.out.println("[" + s + ", " + e + "]");

        int w = Math.min(height[s], height[e]) * (e - s);
        result[0] = Math.max(result[0], w);

        for (int i = s; i <= e && e < height.length - 1;) {
//            if (cache[i] == 1) continue;
//            cache[i] = 1;
            e++;
            maxArea(height, result, i++, e, cache);
            e--;
//            cache[i] = 0;
        }
    }
}
