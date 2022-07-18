package pw.avvero.ctci;

public class Chapter1Ex7 {

    public static int[][] zerofy(int[][] input) {
        int[][] output = new int[input.length][];
        for (int i = 0; i < input.length; i++) {
            int[] row = input[i];
            for (int j = 0; j < row.length; j++) {
                if (input[i][j] == 0) {
                    output[i] = new int[row.length];
                    for (int k = 0; k < input.length; k++) {
                        if (output[k] == null) {
                            output[k] = new int[row.length];
                        }
                        input[k][j] = -1;
                        output[k][j] = 0;
                    }
                    break;
                } else {
                    if (output[i] == null) {
                        output[i] = new int[row.length];
                    }
                    if (input[i][j] == -1) continue;
                    output[i][j] = input[i][j];
                }
            }
        }
        return output;
    }
    public static int[][] zerofy2(int[][] input) {
        boolean[] rows = new boolean[input.length];
        boolean[] columns = new boolean[input[0].length];

        for (int i = 0; i < input.length; i ++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }
        for (int i = 0; i < input.length; i ++) {
            for (int j = 0; j < input[i].length; j++) {
                if (rows[i] || columns[j]) {
                    input[i][j] = 0;
                }
            }
        }
        return input;
    }

}
