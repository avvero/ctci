package pw.avvero.leet.year2023_06;

public class Problem12 {

    String[][] symbolsMap = new String[][]{
            new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"},
            new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"},
            new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M"},
            new String[]{"M", "MM", "MMM"}
    };

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int rmn, mod;
        int l = 10;
        do {
            rmn = num / l * l;
            mod = num % l;
            String[] symbols = symbolsMap[ln(l) - 1];
            int i = mod * 10 / l - 1;
            if (i >= 0) {
                result.insert(0, symbols[i]);
            }
            num -= mod;
            l *= 10;
        } while (rmn > 0);
        return result.toString();
    }

    private int ln(int num) {
        return (int) Math.log(num) / (int) Math.log(10);
    }

}
