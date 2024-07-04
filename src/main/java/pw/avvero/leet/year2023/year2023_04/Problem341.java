package pw.avvero.leet.year2023.year2023_04;

import java.util.Iterator;
import java.util.List;

public class Problem341 {

    public interface NestedInteger {
        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    public static class NestedIterator implements Iterator<Integer> {

        private final List<NestedInteger> list;
        private int i;
        private NestedIterator iterator;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.list = nestedList;
        }

        @Override
        public Integer next() {
            if (i == list.size()) return null;
            if (list.get(i).isInteger()) {
                Integer next = list.get(i).getInteger();
                i++;
                return next;
            } else {
                Integer next;
                if (iterator == null) {
                    iterator = new NestedIterator(list.get(i).getList());
                }
                if (iterator.hasNext()) {
                    next = iterator.next();
                    if (!iterator.hasNext()) {
                        iterator = null;
                        i++;
                    }
                } else {
                    // empty list
                    iterator = null;
                    i++;
                    next = next();
                }
                return next;
            }
        }

        @Override
        public boolean hasNext() {
            if (i == list.size()) return false;
            if (list.get(i).isInteger()) {
                return true;
            } else {
                if (iterator == null) {
                    iterator = new NestedIterator(list.get(i).getList());
                }
                if (iterator.hasNext()) {
                    return iterator.hasNext();
                } else {
                    // empty list
                    iterator = null;
                    i++;
                    return hasNext();
                }
            }
        }
    }

}
