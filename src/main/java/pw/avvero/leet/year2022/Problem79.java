package pw.avvero.leet.year2022;

import java.util.ArrayList;
import java.util.List;

public class Problem79 {
    public boolean exist(char[][] board, String word) {
        int[][] path = new int[board.length][];
        for (int i = 0; i < path.length; i++) {
            path[i] = new int[board[0].length];
        }
        char[] chars = word.toCharArray();
        return exist(board, chars, 0, 0, 0, path);
    }

    private boolean exist(char[][] board, char[] chars, int c, int i, int j, int[][] path) {
        if (i < 0 || i >= board.length) {
            return false;
        }
        if (j < 0 || j >= board[i].length) {
            return false;
        }
        if (path[i][j] == 1) {
            return false;
        }
        if (board[i][j] == chars[c]) {
            if (c == chars.length - 1) {
                return true;
            }
            path[i][j] = 1;
            boolean result = exist(board, chars, c + 1, i, j + 1, path)
                    || exist(board, chars, c + 1, i + 1, j, path)
                    || exist(board, chars, c + 1, i - 1, j, path)
                    || exist(board, chars, c + 1, i, j - 1, path);
            if (!result) {
                path[i][j] = 0;
            }
            return result;
        } else {
            return exist(board, chars, 0, i, j + 1, path)
                    || exist(board, chars, 0, i + 1, j, path);
        }
    }
}
