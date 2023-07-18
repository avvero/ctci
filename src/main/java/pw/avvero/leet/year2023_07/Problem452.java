package pw.avvero.leet.year2023_07;

import java.util.*;

public class Problem452 {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparing(a -> new Long(a[1])));
        int arrows = 1;
        int arrow = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] <= arrow) {
                continue;
            }
            arrows++;
            arrow = points[i][1];
        }
        return arrows;
    }

}
