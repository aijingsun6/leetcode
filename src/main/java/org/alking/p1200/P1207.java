package org.alking.p1200;

import java.util.Arrays;

public class P1207 {

    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }
        int min = arr[0];
        int max = arr[0];
        for (int v : arr) {
            min = Math.min(min, v);
            max = Math.max(max, v);
        }
        int[] countArr = new int[max - min + 1];
        for (int v : arr) {
            int idx = v - min;
            countArr[idx]++;
        }
        Arrays.sort(countArr);
        for (int idx = 1; idx < countArr.length; idx++) {
            if (countArr[idx] > 0 && countArr[idx] == countArr[idx - 1]) {
                return false;
            }
        }
        return true;
    }
}
