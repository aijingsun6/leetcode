package org.alking.p1200;


public class P1299 {

    public int[] replaceElements(int[] arr) {

        if (arr == null) {
            return null;
        }

        int[] result = new int[arr.length];
        int max = 0;
        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
            }
            result[i - 1] = max;
        }
        result[result.length - 1] = -1;
        return result;
    }
}
