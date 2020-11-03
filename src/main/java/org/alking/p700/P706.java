package org.alking.p700;

import java.util.Arrays;

public class P706 {

    static class MyHashMap {

        public static final int MAX = 1000000;

        private int[] hash = new int[MAX + 1];

        public MyHashMap() {
            Arrays.fill(hash, -1);
        }
        public void put(int key, int value) {
            hash[key] = value;
        }
        public int get(int key) {
            return hash[key];
        }
        public void remove(int key) {
            hash[key] = -1;
        }
    }
}
