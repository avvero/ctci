package pw.avvero.leet;

import java.util.LinkedList;
import java.util.List;

public class Problem22 {

    public List<String> generateParenthesis(int n) {
        List<String> rst = new LinkedList<>();
        char[] temp = new char[2 * n];
        helper(temp, n, n, rst);
        return rst;
    }

    private void helper(char[] temp, int left, int right, List<String> rst){
        if(left == 0 && right == 0){
            rst.add(new String(temp));
            return;
        }

        int cur = temp.length - left - right;

        if(left > 0){
            temp[cur] = '(';
            helper(temp, left - 1, right, rst);
        }

        if(right > left){
            temp[cur] = ')';
            helper(temp, left, right - 1, rst);
        }
    }
}
