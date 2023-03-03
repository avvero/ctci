package pw.avvero.leet.year2022;

import java.util.HashSet;

public class Problem733 {

    HashSet buffer = new HashSet();

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == 0 || image[sr][sc] == 0) return image;
        String key = "" + sr + "_" + sc;
        if (buffer.contains(key)) {
            return image;
        } else {
            buffer.add(key);
        }
        image[sr][sc] = image[sr][sc] != 0 ? color : 0;
        if (sr > 0) {
            floodFill(image, sr - 1, sc, color);
        }
        if (sr < image.length - 1) {
            floodFill(image, sr + 1, sc, color);
        }
        if (sc > 0) {
            floodFill(image, sr, sc - 1, color);
        }
        if (sc < image[sr].length - 1) {
            floodFill(image, sr, sc + 1, color);
        }
        return image;
    }
}
