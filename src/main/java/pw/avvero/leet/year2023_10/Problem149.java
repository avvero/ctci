package pw.avvero.leet.year2023_10;

import java.util.ArrayList;
import java.util.List;

public class Problem149 {

    public class Line {
        int x1 = 0;
        int y1 = 0;

        int k1 = 0;
        int k2 = 0;
        int b1 = 0;
        int b2 = 0;

        Integer x;
        Integer y;

        int size = 0;
    }

    public int maxPoints(int[][] points) {
        if (points.length < 3) return points.length;

        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                Line line = new Line();
                lines.add(line);
                if (points[i][0] == points[j][0]) {
                    line.x = points[i][0];
                } else if (points[i][1] == points[j][1]) {
                    line.y = points[i][1];
                } else {
                    int[] f = findFormula(points[i], points[j]);
                    line.x1 = points[i][0];
                    line.y1 = points[i][1];
                    line.k1 = f[0];
                    line.k2 = f[1];
                    line.b1 = f[2];
                    line.b2 = f[3];
                }
            }
        }
        int maxLine = 0;
        for (int i = 0; i < points.length; i++) {
            for (Line line : lines) {
                if (line.x != null) {
                    if (points[i][0] == line.x) {
                        line.size++;
                    }
                } else if (line.y != null) {
                    if (points[i][1] == line.y) {
                        line.size++;
                    }
                } else if (line.x1 == points[i][0] && line.y1 == points[i][1]){
                    line.size++;
                } else {
                    int[] f = findFormula(new int[]{line.x1, line.y1}, points[i]);
                    if (same(f[0], f[1], line.k1, line.k2) && same(f[2], f[3], line.b1, line.b2)) {
                        line.size++;
                    }
                }
                maxLine = Math.max(maxLine, line.size);
            }
        }
        return maxLine;
    }

    // b = (x2y1 - x1y2) / (x2 - x1)
    // y1 = kx1 + b
    // y2 = kx2 + b
    // y1 - kx1 = y2 - kx2
    // kx2 - kx1 = y2 - y1
    // k = (y2 - y1) / (x2 - x1)
    private int[] findFormula(int[] a, int[] b) {
        int x1 = a[0];
        int y1 = a[1];
        int x2 = b[0];
        int y2 = b[1];
        return new int[] {y2 - y1, x2 - x1, x2 * y1 - x1 * y2, x2 - x1};
    }

    // 1/3 3/9
    private boolean same(int k1, int k2, int k21, int k22) {
        if (k1 == 0) return k21 == 0 ;
        if (k2 == 0) return k22 == 0;
        if (k1 > k21) {
            return k1 / k21 == k2 / k22 && k1 % k21 == 0 && k2 % k22 == 0;
        } else {
            return k21 / k1 == k22 / k2 && k21 % k1 == 0 && k22 % k2 == 0;
        }
    }
}
