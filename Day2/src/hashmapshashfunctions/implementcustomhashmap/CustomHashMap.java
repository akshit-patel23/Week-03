package hashmapshashfunctions.implementcustomhashmap;

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<HashNode<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new HashNode<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[index];

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[index];

        bucket.removeIf(node -> node.key.equals(key));
    }
}