package pw.avvero.leet.year2023_03;

import java.util.HashMap;
import java.util.Map;

public class Problem146 {

    static class LRUCache {

        private class Bucket {
            int key;
            int value;
            int age;
        }

        private Bucket[] cache;
        private int factor;
        private int capacity;
        private int bit;
        private HashMap<Integer, Bucket> buckets = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new Bucket[capacity];
        }

        public int get(int key) {
            Bucket bucket = getBucket(key);
            return bucket != null ? bucket.value : -1;
        }

        public void put(int key, int value) {
            Bucket bucket = getBucket(key);
            if (bucket != null) {
                bucket.value = value;
                return;
            }
            if (factor < capacity) {
                Bucket newBucket = new Bucket();
                newBucket.key = key;
                newBucket.value = value;
                newBucket.age = ++bit;
                factor++;
                buckets.put(key, newBucket);
            } else {
                int minAge = Integer.MAX_VALUE;
                int minAgeKey = 0;
                for (Map.Entry<Integer, Bucket> entry : buckets.entrySet()) {
                    if (entry.getValue().age < minAge) {
                        minAge = entry.getValue().age;
                        minAgeKey = entry.getKey();
                    }
                }
                buckets.remove(minAgeKey);
                Bucket newBucket = new Bucket();
                newBucket.key = key;
                newBucket.value = value;
                newBucket.age = ++bit;
                buckets.put(key, newBucket);
            }
        }

        private Bucket getBucket(int key) {
            Bucket bucket = buckets.get(key);
            if (bucket != null) {
                bucket.age = ++bit;
            }
            return bucket;
        }
    }

}
