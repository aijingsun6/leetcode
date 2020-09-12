package org.alking.p1100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class P1122 {


    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            orderMap.put(arr2[i], i);
        }

        Integer[] arr = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }


        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (orderMap.containsKey(o1) && orderMap.containsKey(o2)) {
                    return orderMap.get(o1) - orderMap.get(o2);
                }

                if (orderMap.containsKey(o1)) {
                    return -1;
                }

                if (orderMap.containsKey(o2)) {
                    return 1;
                }

                return o1 - o2;
            }
        });

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = arr[i];

        }
        return arr1;
    }
}
