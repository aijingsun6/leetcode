package org.alking.p1800;

import java.util.Arrays;
import java.util.Comparator;

public class P1893 {

    public boolean isCovered(int[][] ranges, int left, int right) {

        if (ranges.length < 1) {
            return false;
        }

        // sort
        Arrays.sort(ranges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];

            }
        });

        int N = ranges.length;
        if (ranges[0][0] > left) {
            return false;
        }
        int rightPtr = 0;
        boolean start = false;
        for (int i = 0; i < N; i++) {

            if(!start && ranges[i][1] >= left){
                start = true;
                rightPtr = ranges[i][1];
            }
            if (!start) {
                continue;
            }

            if (ranges[i][0] > rightPtr + 1) {
                return false;
            }
            rightPtr = Math.max(rightPtr, ranges[i][1]);
        }
        return rightPtr >= right;
    }
}
