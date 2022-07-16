package pw.avvero.ctci;

public class Chapter1Ex6 {

    public static int[][] rotate(int[][] input) {
        int[][] output = new int[input.length][];
        for (int i = 0; i < input.length; i++) {
            output[i] = new int[input.length];
        }
        for (int i = input.length - 1; i >= 0; i--) {
            int[] row = input[i];
            for (int j = 0; j < row.length; j++) {
                output[i][input.length - 1 - j] = input[j][i];
            }
        }
        return output;
    }

}
