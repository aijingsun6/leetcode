package org.alking.p1000;

import java.util.Arrays;

public class P1051 {

    public int heightChecker(int[] heights) {
        int[] sort = new int[heights.length];
        System.arraycopy(heights, 0, sort, 0, heights.length);
        Arrays.sort(sort);
        int num = 0;
        for (int idx = 0; idx < heights.length; idx++) {
            if (heights[idx] != sort[idx]) {
                num += 1;
            }
        }
        return num;
    }
}
