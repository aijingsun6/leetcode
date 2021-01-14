package org.alking.p1500;

public class P1534 {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        if (arr == null || arr.length < 3) {
            return 0;
        }


        int acc = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (checkGood(arr[i], arr[j], arr[k], a, b, c)) {
                        acc += 1;
                    }
                }
            }
        }
        return acc;

    }

    private boolean checkGood(int p1, int p2, int p3, int a, int b, int c) {

        if (Math.abs(p1 - p2) > a) {
            return false;
        }
        if (Math.abs(p2 - p3) > b) {
            return false;
        }
        if (Math.abs(p1 - p3) > c) {
            return false;
        }
        return true;
    }
}
