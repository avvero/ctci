package pw.avvero.leet.year2022;

public class Problem11 {
    public int maxArea(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                System.out.println("[" + i + ", " + j + "]");
                int w = Math.min(height[i], height[j]) * (j - i);
                result = Math.max(result, w);
            }
        }
        return result;
    }
}
