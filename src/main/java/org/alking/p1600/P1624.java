package org.alking.p1600;

import java.util.ArrayList;

public class P1624 {

    public int maxLengthBetweenEqualCharacters(String s) {

        ArrayList<Integer>[] bucket = new ArrayList[26];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a'].add(i);
        }
        int max = -1;
        for (int i = 0; i < bucket.length; i++) {
            int size = bucket[i].size();
            if (size > 1) {
                max = Math.max(max, bucket[i].get(size-1) - bucket[i].get(0) - 1);
            }
        }
        return max;
    }
}
