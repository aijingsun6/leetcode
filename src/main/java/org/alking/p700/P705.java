package org.alking.p700;

public class P705 {

    public static class MyHashSet {

        public static class Node {
            public int key;
            public Node next;

            public Node(int key, Node next) {
                this.key = key;
                this.next = next;
            }
        }

        private static final int ARRAY_SIZE = 16;

        private Node[] hash = new Node[ARRAY_SIZE];

        public MyHashSet() {
        }

        public void add(int key) {

            int idx = Math.abs(key) % ARRAY_SIZE;
            Node first = hash[idx];
            Node node = hash[idx];
            for (; node != null; node = node.next) {
                if (node.key == key) {
                    return;
                }
            }
            Node n = new Node(key, first);
            hash[idx] = n;
        }

        public void remove(int key) {
            int idx = Math.abs(key) % ARRAY_SIZE;
            Node node = hash[idx];
            Node last = null;
            for (; node != null; last = node, node = node.next) {
                if (node.key == key) {
                    if (last == null) {
                        //first node
                        hash[idx] = node.next;
                    } else {
                        last.next = node.next;
                    }
                    return;
                }
            }
        }

        public boolean contains(int key) {
            int idx = Math.abs(key) % ARRAY_SIZE;
            Node node = hash[idx];
            for (; node != null; node = node.next) {
                if (node.key == key) {
                    return true;
                }
            }
            return false;
        }
    }
}
