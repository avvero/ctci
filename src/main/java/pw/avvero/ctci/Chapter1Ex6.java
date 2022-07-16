package pw.avvero.ctci;

public class Chapter1Ex6 {

    public static int[][] rotate(int[][] input) {
        int[][] output = new int[input.length][];
        for (int i = 0; i < input.length; i++) {
            output[i] = new int[input.length];
        }
        int offset = input.length - 1;
        for (int i = 0; i < input.length; i++) {
            int[] row = input[i];
            for (int j = 0; j < row.length; j++) {
                output[offset - i][offset - j] = input[j][offset - i];
            }
        }
        return output;
    }

}
