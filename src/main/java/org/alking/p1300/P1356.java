package org.alking.p1300;

import java.util.Arrays;
import java.util.Comparator;

public class P1356 {

    private int calcBits(Integer v) {
        int acc = 0;
        while (v > 0) {
            if ((v & 1) > 0) {
                acc++;
            }
            v = v >> 1;
        }
        return acc;
    }



    public int[] sortByBits(int[] arr) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int b1 = calcBits(o1);
                int b2 = calcBits(o2);
                if (b1 == b2) {
                    return o1 - o2;
                } else {
                    return b1 - b2;
                }
            }
        };
        int size = arr.length;
        Integer[] iarr = new Integer[size];
        for(int i = 0;i < size;i++){
            iarr[i] = arr[i];
        }
        Arrays.sort(iarr,comparator);
        int[] res = new int[size];

        for(int i = 0;i < size;i++){
            res[i] = iarr[i];
        }
        return res;
    }
}
