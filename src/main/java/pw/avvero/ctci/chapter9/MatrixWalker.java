package pw.avvero.ctci.chapter9;

import java.util.ArrayList;
import java.util.List;

public class MatrixWalker {

    static class Cursor {
        int x;
        int y;

        static Cursor of(int x, int y) {
            Cursor cursor = new Cursor();
            cursor.x = x;
            cursor.y = y;
            return cursor;
        }
    }

    public static List<List<List<Integer>>> getWays(List<List<Integer>> end) {
//        Cursor cursor = Cursor.of(0, 0);
        List<List<List<Integer>>> result = new ArrayList<>();

//        walk(cursor, end);

        return result;
    }

    public static List<List<Integer>> walk(List<List<Integer>> prev, Cursor cursor, List<List<Integer>> end) {
//        List<List<Integer>> current = copy(prev);
//        current.get(cursor.y).set(cursor.x, 1);
//        if (eq(current, end)) {
//            return current;
        return prev;
    }
}
