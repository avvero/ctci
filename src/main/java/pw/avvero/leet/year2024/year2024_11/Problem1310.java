package pw.avvero.leet.year2024.year2024_11;

public class Problem1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[][] ones = new int[arr.length + 1][8];
        for (int i = 0; i < arr.length; i++) {
            ones[i + 1] = sum(ones[i], twobased(arr[i]));
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0], e = queries[i][1];
            int[] slice = slice(ones[e + 1], ones[s]);
            doxor(slice);
            result[i] = tenbased(slice);
        }
        return result;
    }

    private void doxor(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 1) {
                n[i] = 0;
            }
        }
    }

    private int[] twobased(int n) {
        int[] r = new int[8];
        int i = r.length - 1;
        while(n > 0) {
            r[i--] = n % 2;
            n = n>>1;
        }
        return r;
    }

    private int tenbased(int[] n) {
        int r = 0;
        for (int i = 0; i < n.length; i++) {
            r += n[i] * Math.pow(2, n.length - i - 1);
        }
        return r;
    }

    private int[] sum(int[] a, int[] b) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            r[i] = a[i] + b[i];
        }
        return r;
    }

    private int[] slice(int[] b, int[] a) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            r[i] = b[i] - a[i];
        }
        return r;
    }
}
