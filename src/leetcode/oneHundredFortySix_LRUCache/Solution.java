package leetcode.oneHundredFortySix_LRUCache;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    int capacity;
    Map<Integer, Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            if (cache.size() >= capacity) {
                Node toRemove = tail.prev;
                removeNode(toRemove);
                cache.remove(toRemove.key);
            }

            Node node = new Node(key, value);
            cache.put(key, node);
            addToHead(node);
        }
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = null;
        node.next = null;
    }

    private void addToHead(Node node) {
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }
}
