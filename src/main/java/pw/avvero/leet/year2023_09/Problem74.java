package pw.avvero.leet.year2023_09;

public class Problem74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        return searchMatrix(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    public boolean searchMatrix(int[][] matrix, int target, int is, int ie, int js, int je) {
        if (ie < is || je < js) return false;
        if (is < 0 || ie < 0 || js < 0 || je < 0) return false;
        if (ie >= matrix.length || je >= matrix[ie].length) return false;
        if (is == ie) {
            if (js == je) return matrix[is][js] == target;
            int jmid = js + (je - js) / 2;
            if (matrix[is][jmid] == target) {
                return true;
            } else if (target <= matrix[is][jmid]) {
                return searchMatrix(matrix, target, is, ie, js, jmid - 1);
            }  else {
                return searchMatrix(matrix, target, is, ie, jmid + 1, je);
            }
        }
        int imid = is + (ie - is) / 2;
        if (target < matrix[imid][js]) {
            return searchMatrix(matrix, target, is, imid - 1, js, je);
        }
        if (target >= matrix[imid][js] && target <= matrix[imid][je]) {
            return searchMatrix(matrix, target, imid, imid, js, je);
        }
        return searchMatrix(matrix, target, imid + 1, ie, js, je);
    }
}
