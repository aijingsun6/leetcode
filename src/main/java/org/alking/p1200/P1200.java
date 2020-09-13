package org.alking.p1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P1200 {


    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        if (arr == null || arr.length < 2) {
            return Collections.emptyList();
        }

        Arrays.sort(arr);


        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            if (gap < min) {
                min = gap;
            }
        }
        List<List<Integer>> acc = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            if (gap == min) {
                acc.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return acc;
    }
}
