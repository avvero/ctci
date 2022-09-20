package pw.avvero.ctci.chapter3;

public class Tuple<K, V> {

    public K k;
    public V v;

    public Tuple(K k, V v) {
        this.k = k;
        this.v = v;
    }

    @Override
    public String toString() {
        return "{" + k + "," + v + '}';
    }
}
