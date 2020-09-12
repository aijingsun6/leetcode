package org.alking.p1300;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1346 {

    public boolean checkIfExist(int[] arr) {

        if (arr == null || arr.length < 2) {
            return false;
        }

        int[] pos = new int[arr.length];
        int posCnt = 0;

        int[] neg = new int[arr.length];
        int negCnt = 0;

        int zeroCnt = 0;


        for (int idx = 0; idx < arr.length; idx++) {
            int v = arr[idx];
            if (v == 0) {
                zeroCnt += 1;
                if (zeroCnt > 1) {
                    // zero count > 1
                    return true;
                }
            } else if (v > 0) {
                pos[posCnt] = v;
                posCnt += 1;
            } else {
                neg[negCnt] = v;
                negCnt += 1;
            }
        }
        return checkIfExist(pos, 0, posCnt, true) || checkIfExist(neg, 0, negCnt, false);
    }

    private boolean checkIfExist(int[] arr, int offset, int size, boolean pos) {

        Arrays.sort(arr, offset, offset + size);
        Set<Integer> set = new HashSet<>();

        if (pos) {

            for (int idx = offset; idx < offset + size; idx++) {
                int v = arr[idx];
                set.add(v);
                if (v % 2 == 0 && set.contains(v / 2)) {
                    return true;
                }

            }
            return false;

        }
        // neg
        for (int idx = offset + size - 1; idx >= offset; idx--) {
            int v = arr[idx];
            set.add(v);
            if (v % 2 == 0 && set.contains(v / 2)) {
                return true;
            }
        }

        return false;
    }
}
