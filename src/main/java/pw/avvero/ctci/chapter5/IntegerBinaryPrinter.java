package pw.avvero.ctci.chapter5;

public class IntegerBinaryPrinter {

    public static String print(int value) {
        StringBuilder sb = new StringBuilder();
        while (value != 0) {
            if (value == 1) {
                sb.append(1);
                value--;
            } else {
                sb.append(value % 2 == 1 ? 1 : 0);
                value = value / 2;
            }
        }
        while (sb.length() < 8) {
            sb.append(0);
        }
        return sb.reverse().toString();
    }

}
