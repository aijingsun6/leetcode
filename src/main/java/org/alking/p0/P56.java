package org.alking.p0;

import java.util.Arrays;
import java.util.Comparator;

public class P56 {


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int[][] acc = new int[intervals.length][2];
        int count = 0;

        for (int[] arr : intervals) {
            if (count == 0) {
                acc[count] = arr;
                count += 1;
                continue;
            }
            boolean merged = false;
            for (int i = 0; i < count; i++) {
                if (acc[i][0] <= arr[1] && acc[i][1] >= arr[0]) {
                    // 有重叠部分,需要合并
                    acc[i][0] = Math.min(arr[0], acc[i][0]);
                    acc[i][1] = Math.max(arr[1], acc[i][1]);
                    merged = true;
                    break;

                }
            }
            if (!merged) {
                acc[count] = arr;
                count++;
            }
        }

        int[][] result = new int[count][2];
        System.arraycopy(acc, 0, result, 0, count);
        return result;
    }
}
