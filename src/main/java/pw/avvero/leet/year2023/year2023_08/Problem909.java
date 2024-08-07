package pw.avvero.leet.year2023.year2023_08;

import java.util.LinkedList;

public class Problem909 {

    public int snakesAndLadders(int[][] board) {
        int squeresCount = board.length * board[0].length;
        int[][] visited = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            visited[i] = new int[board[i].length];
        }
        LinkedList toVisite = new LinkedList();
        int[] start = new int[]{board.length - 1, 0};
        toVisite.add(start);
        while (!toVisite.isEmpty()) {
            int[] current = (int[]) toVisite.removeFirst();
            int val = visited[current[0]][current[1]];
            for (int i = 1; i <= Math.min(6, squeresCount); i++) {
                int[] next = next(board, current, i);
                if (next[0] == -1 || next[1] == -1) break;
                int nextLink = board[next[0]][next[1]];
                if (nextLink > -1) {
                    int[] linked = next(board, start, nextLink - 1);
                    if (linked[0] < 0 || linked[1] < 0) {
                        linked = next(board, start, squeresCount - 1); // last
                    }
                    if (setStep(visited, linked, val + 1)) {
                        toVisite.add(linked);
                    }
                } else {
                    if (setStep(visited, next, val + 1)) {
                        toVisite.add(next);
                    }
                }
            }
        }
        int[] last = next(board, start, squeresCount - 1);
        int result = visited[last[0]][last[1]];
        return result > 0 ? result : -1;
    }

    private boolean setStep(int[][] visited, int[] current, int step) {
        if (visited[current[0]][current[1]] == 0 || visited[current[0]][current[1]] > step) {
            visited[current[0]][current[1]] = step;
            return true;
        } else {
            return false;
        }
    }

    public int[] next(int[][] board, int[] current, int n) {
        if (n == 0) return current;
        int i = current[0];
        int j = current[1];
        //
        int md;
        int rm;
        if ((board.length - i) % 2 == 1) {
            md = (j + n) % board[i].length;
            rm = (j + n) / board[i].length;
        } else {
            md = (board[i].length - 1 - (j - n)) % board[i].length;
            rm = (board[i].length - 1 - (j - n)) / board[i].length;
        }
        i -= rm;
        if (i < 0) {
            return new int[]{-1, -1};
        }
        j = (board.length - i) % 2 == 1 ? md : board[i].length - 1 - md;
        return new int[]{i, j};
    }

}
