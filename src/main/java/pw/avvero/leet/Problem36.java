package pw.avvero.leet;

public class Problem36 {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, i + 1, 0, 9)) return false;
            if (!isValid(board, 0, 9, i, i + 1)) return false;
            int r = i / 3 * 3;
            int c = (i % 3) * 3;
            if (!isValid(board, r, r + 3, c, c + 3)) return false;
        }
        return true;
    }
    private boolean isValid(char[][] board, int rs, int re, int cs, int ce) {
        char[] nums = new char[9];
        for (int i = rs; i < re; i++) {
            for (int j = cs; j < ce; j++) {
                if (board[i][j] == '.') continue;
                if (nums[board[i][j] - '1'] != 0) {
                    return false;
                } else {
                    nums[board[i][j] - '1'] = 1;
                }
            }
        }
        return true;
    }
}
