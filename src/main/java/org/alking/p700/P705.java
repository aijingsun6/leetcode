package org.alking.p700;

public class P705 {

    public static class MyHashSet {

        public static final int MAX = 1000000;

        private boolean[] arr = new boolean[MAX + 1];

        public MyHashSet() {
        }

        public void add(int key) {
            arr[key] = true;
        }

        public void remove(int key) {
            arr[key] = false;
        }

        public boolean contains(int key) {
            return arr[key];
        }
    }
}
