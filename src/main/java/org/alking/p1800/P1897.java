package org.alking.p1800;

public class P1897 {

    public boolean makeEqual(String[] words) {
        final int N = words.length;
        final int SIZE = 'z' - 'a' + 1;
        int[] bucket = new int[SIZE];
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (char c : s.toCharArray()) {
                bucket[c - 'a']++;
            }
        }
        for (int i = 0; i < SIZE; i++) {

            if (bucket[i] % N != 0) {
                return false;
            }
        }
        return true;
    }
}
