package pw.avvero.leet.year2023.year2023_05;

import java.util.HashMap;
import java.util.Random;

public class Problem380 {

    public static class RandomizedSet {

        private final HashMap<Long, Integer> set;
        private final long[] indexes;
        private final Random random;
        private final long TH =  2L + Integer.MAX_VALUE;

        public RandomizedSet() {
            this.set = new HashMap<>();
            this.indexes = new long[100];
            this.random = new Random();
        }

        public boolean insert(int val) {
            long key = TH + val;
            boolean removed = remove(val);
            int index = set.size();
            set.put(key, index);
            indexes[index] = key;
            return !removed;
        }

        public boolean remove(int val) {
            if (set.size() == 0) return false;
            long key = TH + val;
            Integer index = set.get(key);
            if (index == null) {
                return false;
            }
            if (set.size() == 1) {
                set.remove(key);
                indexes[0] = 0;
            } else {
                // move last
                long lastKey = indexes[set.size() - 1];
                indexes[index] = lastKey;
                set.put(lastKey, index);
                indexes[set.size() - 1] = 0;
                set.remove(key);
            }
            return true;
        }

        public int getRandom() {
            long val = indexes[random.nextInt(set.size())];
            return (int) (val - TH);
        }
    }
}
