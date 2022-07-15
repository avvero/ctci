package pw.avvero.ctci;

public class Chapter1Ex4 {

    public static String escape(String input) {
        if (input == null) return null;
        char[] inputChars = input.toCharArray();
        int inputCharsIndex = 0;
        char[] outputChars = new char[inputChars.length];
        int outputCharsIndex = 0;
        for (; inputCharsIndex < inputChars.length && outputCharsIndex < inputChars.length; inputCharsIndex++) {
            char ch = inputChars[inputCharsIndex];
            if (ch == ' ') {
                outputChars[outputCharsIndex++] = '%';
                outputChars[outputCharsIndex++] = '2';
                outputChars[outputCharsIndex++] = '0';
            } else {
                outputChars[outputCharsIndex++] = inputChars[inputCharsIndex];
            }
        }
        return new String(outputChars);
    }

}
