package org.alking.p1500;

public class P1550 {

    public boolean threeConsecutiveOdds(int[] arr) {

        if (arr == null || arr.length < 3) {
            return false;
        }


        int size = arr.length;
        int idx = 0;
        // s -3, s -2 s - 1
        int v;
        int v1;
        int v2;
        while (idx < (size - 2)) {

            v = arr[idx];
            if (v % 2 == 0) {
                idx += 1;
                continue;
            }
            // v is odd
            v1 = arr[idx + 1];
            if (v1 % 2 == 0) {
                idx = idx + 2;
                continue;
            }
            // v1 is odd

            v2 = arr[idx + 2];
            if (v2 % 2 == 0) {
                idx = idx + 3;
                continue;
            }
            return true;
        }
        return false;
    }
}
