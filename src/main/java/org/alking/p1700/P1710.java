package org.alking.p1700;

import java.util.Arrays;
import java.util.Comparator;

public class P1710 {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int acc = 0;
        int size = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int[] box = boxTypes[i];
            int add = Math.min(truckSize - size, box[0]);
            acc += add * box[1];
            size += add;
            if (size >= truckSize) {
                return acc;
            }
        }
        return acc;
    }
}
