package org.alking.p800;

import java.util.HashMap;

public class P869 {

    public static final int MAX = 1_000_000_000;

    private static final HashMap<Integer, Integer> map = new HashMap<>();

    static {
        int n = 1;
        while (n < MAX) {
            Integer h = hash(n);
            map.put(h,n);
            n = n << 1;
        }
    }

    private static Integer hash(int n) {
        int[] arr = new int[10];
        int v;
        while (n > 0) {
            v = n % 10;
            arr[v]++;
            n = n / 10;
        }
        int h = 0;
        for (int i = 0; i < 10; i++) {
            h = 31 * h + arr[i];
        }
        return h;
    }

    public boolean reorderedPowerOf2(int n) {
        Integer h = hash(n);
        return map.containsKey(h);
    }

}
