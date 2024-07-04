package pw.avvero.leet.year2023.year2023_09;

public class Problem52 {

    public int totalNQueens(int n) {
        int[] result = new int[1];
        int[][] board = new int[n][];
        for (int i = 0; i < n; i++) {
            board[i] = new int[n];
        }
        total(result, board, n, 1, 0, 0);
        return result[0];
    }

    private void total(int[] result, int[][] board, int n, int queen, int pi, int pj) {
        if (queen > n) {
            result[0]++;
            return;
        }
        if (pi == board.length || pj == board.length) return;

        for (int i = pi; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!isSafe(board, i, j)) {
                    continue;
                }
                board[i][j] = queen;
                total(result, board, n, queen + 1, i + 1, j);
                //total(result, board, n, queen + 1, i, j + 1);
                //total(result, board, n, queen + 1, i + 1, j + 1);
                board[i][j] = 0;
            }
        }
    }

    private boolean isSafe(int[][] board, int pi, int pj) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][pj] > 0) return false;
        }
        for (int j = 0; j < board.length; j++) {
            if (board[pi][j] > 0) return false;
        }
        for (int i = pi, j = pj; i >= 0 && j >=0; i--, j--) {
            if (board[i][j] > 0) return false;
        }
        for (int i = pi, j = pj; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] > 0) return false;
        }
        for (int i = pi, j = pj; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] > 0) return false;
        }
        for (int i = pi, j = pj; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] > 0) return false;
        }
        return true;
    }
}
