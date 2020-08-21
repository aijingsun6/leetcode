package org.alking.p1300;

import java.util.HashMap;
import java.util.Map;

public class P1317 {

    private static int MIN = 2;

    private static final Map<Integer, int[]> cache = new HashMap<>();

    static {
        cache.put(2, new int[]{1, 1});
        cache.put(3, new int[]{1, 2});
        cache.put(4, new int[]{2, 2});
        cache.put(5, new int[]{2, 3});
        cache.put(6, new int[]{3, 3});
        cache.put(7, new int[]{3, 4});
        cache.put(8, new int[]{4, 4});
        cache.put(9, new int[]{4, 5});
        cache.put(10, new int[]{5, 5});
        cache.put(11, new int[]{5, 6});
        cache.put(12, new int[]{6, 6});
        cache.put(13, new int[]{6, 7});
        cache.put(14, new int[]{7, 7});
        cache.put(15, new int[]{7, 8});
        cache.put(16, new int[]{8, 8});
        cache.put(17, new int[]{8, 9});
        cache.put(18, new int[]{9, 9});
        cache.put(19, new int[]{5, 14});
    }

    public int[] getNoZeroIntegers(int n) {
        if(n < MIN){
            return null;
        }
        int size = 20;
        int[] ns = new int[size];
        int idx = -1;
        while (n > 0) {
            idx += 1;
            ns[idx] = n % 10;
            n = n / 10;
        }

        int[] arrA = new int[size];
        int[] arrB = new int[size];
        int idxA = -1;
        int idxB = -1;
        for (int i = 0; i <= idx; i++) {
            int v = ns[i];
            if(v < MIN && i < idx){
                idxA += 1;
                idxB += 1;
                ns[i+1] = ns[i+1] -1;
                int[] c = cache.get(v + 10);
                arrA[idxA] = c[0];
                arrB[idxB] = c[1];

            }else if(v == 0 && i == idx){
                // last
                break;
            } else if(v < MIN){
                // v = 1
                idxA += 1;
                arrA[idxA] = v;

            }else {
                // v > MIN
                idxA += 1;
                idxB += 1;
                int[] c = cache.get(v);
                arrA[idxA] = c[0];
                arrB[idxB] = c[1];
            }
        }
        int ra = 0;
        for(int i = idxA;i >=0; i--){
            ra = ra * 10 + arrA[i];
        }

        int rb = 0;
        for(int i = idxB;i >=0;i--){
            rb = rb * 10 + arrB[i];
        }
        return new int[]{ra,rb};

    }
}
