package org.alking.p900;

import java.util.Arrays;

public class P997 {

    public int findJudge(int N, int[][] trust) {

        int[] arr = new int[N + 1];
        Arrays.fill(arr, 0);

        for (int i = 0; i < trust.length; i++) {
            arr[trust[i][0]] = 1;
        }

        int result = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                result = arr[i];
                count += 1;
            }
        }
        if (count == 1) {
            return result;
        }
        return -1;
    }
}
