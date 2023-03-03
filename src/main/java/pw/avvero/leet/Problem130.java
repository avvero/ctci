package pw.avvero.leet;

public class Problem130 {
    public void solve(char[][] board) {
        int[][] spoiled = new int[board.length][];
        for(int i = 0; i < board.length; i++) {
            if (spoiled[i] == null) {
                spoiled[i] = new int[board[i].length];
            }
        }
        //
        for (int j = 0; j < board[0].length; j++) {
            int i = 0;
            if (board[i][j] == 'O') {
                spoiled[i][j] = 'O';
                while(++i < board.length && board[i-1][j] == 'O' && board[i][j] == 'O') {
                    spoil(spoiled, i, j);
                }
            }
        }
        //
        for (int j = 0; j < board[0].length; j++) {
            int i = board.length - 1;
            if (board[i][j] == 'O') {
                spoiled[i][j] = 'O';
                while(--i > 0 && board[i + 1][j] == 'O' && board[i][j] == 'O') {
                    spoil(spoiled, i, j);
                }
            }
        }
        //
        for (int i = 1; i < board.length; i++) {
            int j = 0;
            if (board[i][j] == 'O') {
                spoiled[i][j] = 'O';
                while(++j < board[i].length && board[i][j - 1] == 'O' && board[i][j] == 'O') {
                    spoil(spoiled, i, j);
                }
            }
        }
        //
        for (int i = 1; i < board.length; i++) {
            int j = board[i].length - 1;
            if (board[i][j] == 'O') {
                spoiled[i][j] = 'O';
                while(--j > 0 && board[i][j + 1] == 'O' && board[i][j] == 'O') {
                    spoil(spoiled, i, j);
                }
            }
        }

        for(int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[i].length - 1; j++) {
                if (board[i][j] == 'X') continue;
                if (hasx(board, spoiled, i, i, j - 1, 0, 1, -1) // left
                        && hasx(board, spoiled, i, i, j + 1, board[i].length - 1, 1, 1) //right
                        && hasx(board, spoiled, i - 1, 0, j, j, -1, 1) // top
                        && hasx(board, spoiled, i + 1, board.length - 1, j, j, 1, 1)) { //down
                    board[i][j] = 'X';
                }
            }
        }
    }

    // 1 1 0 0
    private boolean hasx(char[][] board, int[][] spoiled, int is, int ie, int js, int je, int stepi, int stepj) {
        for (int i = is; i >= Math.min(is, ie) && i <= Math.max(is, ie);) {
            for (int j = js; j >= Math.min(js, je) && j <= Math.max(js, je);) {
                if (spoiled[i][j] == 'O') return false;
                if (board[i][j] == 'X') return true;
                j = j + stepj;
            }
            i = i + stepi;
        }
        return false;
    }

    private void spoil(int[][] spoiled, int i, int j) {
        spoiled[i][j] = 'O';
        int t = i - 1;
        if (t >= Math.min(0, spoiled.length - 1) && t <= Math.max(0, spoiled.length - 1) && spoiled[t][j] != 'O') {
            spoil(spoiled, t, j);
        }
        int d = i + 1;
        if (d >= Math.min(0, spoiled.length - 1) && d <= Math.max(0, spoiled.length - 1) && spoiled[d][j] != 'O') {
            spoil(spoiled, d, j);
        }
        int l = j - 1;
        if (l >= Math.min(0, spoiled[0].length - 1) && l <= Math.max(0, spoiled[0].length - 1) && spoiled[i][l] != 'O') {
            spoil(spoiled, i, l);
        }
        int r = j + 1;
        if (r >= Math.min(0, spoiled[0].length - 1) && r <= Math.max(0, spoiled[0].length - 1) && spoiled[i][r] != 'O') {
            spoil(spoiled, i, r);
        }
    }
}
