package pw.avvero.leet.year2025_03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem385 {

    public static class NestedInteger {
        private Integer integer;
        private List<NestedInteger> list;

        public Integer getInteger() {
            return integer;
        }

        public void setInteger(Integer integer) {
            this.integer = integer;
        }

        public List<NestedInteger> getList() {
            return list;
        }

        public void setList(List<NestedInteger> list) {
            this.list = list;
        }
    }

    public NestedInteger deserialize(String s) {
        List list = new ArrayList();
        int i = 0;
        int sign = 1;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == '-') {
                sign = -1;
            }
            if (c == '[' || c == ']' || c == ',') {
                if (j > i) {
                    list.add(Integer.valueOf(s.substring(i, j)) * sign);
                }
                i = j + 1;
                sign = 1;
                if (c == '[' || c == ']') {
                    list.add(c);
                }
            } else if (j == s.length() - 1) {
                list.add(Integer.valueOf(s.substring(i, j + 1)) * sign);
            }
        }
        // [, 123, [, 456, [, 789, ], ], ]
        // [ 123 [ 456 [ 789
        NestedInteger root = new NestedInteger();
        LinkedList<NestedInteger> integers = new LinkedList();
        integers.add(root);
        for (Object object : list) {
            if (object.toString().equals("[")) {

            } else if (object.toString().equals("]")) {

            } else {
                integers.peek().setInteger((Integer) object);
            }
        }
        return root;
    }
}
