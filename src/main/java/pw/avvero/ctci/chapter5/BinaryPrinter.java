package pw.avvero.ctci.chapter5;

public class BinaryPrinter {

    public static String toBinaryString(float number) {
        if (number > 1 || number < 0) return "ERROR";
        StringBuilder sb = new StringBuilder("0.");
        while (number != 0) {
            number = number * 2;
            if (number >= 1) {
                sb.append("1");
                number -= 1;
            } else {
                sb.append("0");
            }
            if (sb.length() > 32) {
                return "ERROR";
            }
        }
        return sb.toString();
    }

    public static double toFloat(String value) {
        double number = 0;
        boolean fraction = false;
        int fposition = -1;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (fraction) {
                int k = c == '1' ? 1 : 0;
                number += k * Math.pow(2, fposition--);
            } else if (c == '.') {
                fraction = true;
            }
        }
        return number;
    }
}
