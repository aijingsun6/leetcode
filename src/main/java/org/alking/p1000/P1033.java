package org.alking.p1000;

import java.util.Arrays;

public class P1033 {


    /**
     * a < b < c
     */
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        int gap1 = arr[1] - arr[0];
        int gap2 = arr[2] - arr[1];
        int minGap = Math.min(gap1, gap2);
        int min;
        if (gap1 == 1 && gap2 == 1) {
            min = 0;
        } else if (minGap < 3) {
            min = 1;
        } else {
            min = 2;
        }
        int max = arr[2] - arr[0] - 2;
        return new int[]{min, max};
    }
}
