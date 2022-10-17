package pw.avvero.ctci.chapter4;

import pw.avvero.ctci.chapter4.BinaryTree.Node;

public class AncestorFinder {

    static class Bucket<T extends Comparable<T>> {
        Node<T> node;
        boolean hasFirst;
        boolean hasSecond;

        public static <T extends Comparable<T>> Bucket<T> of(Node<T> node, boolean hasFirst, boolean hasSecond) {
            Bucket<T> bucket = new Bucket<>();
            bucket.node = node;
            bucket.hasFirst = hasFirst;
            bucket.hasSecond = hasSecond;
            return bucket;
        }
    }

    public static <T extends Comparable<T>> Node<T> find(BinaryTree<T> tree, T first, T second) {
        return findNode(tree.root, first, second).node;
    }

    private static <T extends Comparable<T>> Bucket<T> findNode(Node<T> node, T first, T second) {
        Bucket<T> bucket = new Bucket<>();
        if (node == null) return bucket;
        if (bucket.node != null) return bucket;

        if (node.value.compareTo(first) == 0) {
            bucket.hasFirst = true;
        }
        if (node.value.compareTo(second) == 0) {
            bucket.hasSecond = true;
        }
        Bucket<T> leftBucket = new Bucket<>();
        if (node.left != null) {
            leftBucket = findNode(node.left, first, second);
            if (leftBucket.node != null) return leftBucket;
            if (leftBucket.hasFirst) {
                bucket.hasFirst = true;
            }
            if (leftBucket.hasSecond) {
                bucket.hasSecond = true;
            }
        }
        if ((bucket.hasFirst && leftBucket.hasSecond) || (bucket.hasSecond && leftBucket.hasFirst)) {
            bucket.node = node;
            return bucket;
        }
        Bucket<T> rightBucket = new Bucket<>();
        if (node.right != null) {
            rightBucket = findNode(node.right, first, second);
            if (rightBucket.node != null) return rightBucket;
            if (rightBucket.hasFirst) {
                bucket.hasFirst = true;
            }
            if (rightBucket.hasSecond) {
                bucket.hasSecond = true;
            }
        }
        if ((bucket.hasFirst && rightBucket.hasSecond) || (bucket.hasSecond && rightBucket.hasFirst)) {
            bucket.node = node;
            return bucket;
        }
        if ((leftBucket.hasFirst && rightBucket.hasSecond) || (leftBucket.hasSecond && rightBucket.hasFirst)) {
            bucket.hasFirst = true;
            bucket.hasSecond = true;
            bucket.node = node;
        }
        return bucket;
    }

}
