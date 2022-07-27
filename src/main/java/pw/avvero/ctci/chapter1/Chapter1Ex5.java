package pw.avvero.ctci.chapter1;

import java.util.Arrays;

public class Chapter1Ex5 {

    public static String compress(String input) {
        if (input == null) return null;
        char[] inputChars = input.toCharArray();
        int inputCharsIndex = 0;
        char[] outputChars = new char[inputChars.length * 2];
        int outputCharIndex = 0;
        boolean compressed = false;
        for (; inputCharsIndex < inputChars.length; inputCharsIndex++) {
            char curChar = inputChars[inputCharsIndex];
            outputChars[outputCharIndex++] = curChar;
            outputChars[outputCharIndex] = '1';
            while (inputCharsIndex < inputChars.length - 1 && (inputChars[inputCharsIndex + 1] == curChar)) {
                outputChars[outputCharIndex] = ++outputChars[outputCharIndex];
                inputCharsIndex++;
                compressed = true;
            }
            outputCharIndex++;
        }
        if (compressed) {
            char[] trimmed = Arrays.copyOf(outputChars, outputCharIndex);
            return new String(trimmed);
        } else {
            return input;
        }
    }

}
