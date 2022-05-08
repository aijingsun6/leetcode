package org.alking.p1900;

public class P1974 {

    public int minTimeToType(String word) {
        int start = 'a';
        int acc = 0;
        int add;
        for (int c : word.toCharArray()) {
            if (c > start) {
                add = Math.min(c - start, (start + 26 - c));
            } else {
                add = Math.min(start - c, (c + 26 - start));
            }
            start = c;
            acc = acc + add + 1;
        }
        return acc;

    }
}
