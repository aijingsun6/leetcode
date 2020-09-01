package org.alking.p1300;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1331 {

    public int[] arrayRankTransform(int[] arr) {

        if (arr == null || arr.length < 1) {
            return arr;
        }

        if (arr.length == 1) {
            return new int[]{1};
        }

        int[] arrSort = new int[arr.length];
        System.arraycopy(arr, 0, arrSort, 0, arr.length);
        Arrays.sort(arrSort);
        Map<Integer, Integer> map = new HashMap<>();
        int last = arrSort[0];
        int rank = 1;
        map.put(arrSort[0], 1);

        for(int idx = 1; idx < arrSort.length;idx++){

            if(arrSort[idx] !=last){
                last = arrSort[idx];
                rank += 1;
                map.put(arrSort[idx], rank);
            }
        }

        int[] result = new int[arr.length];
        for (int idx = 0; idx < arr.length; idx++) {
            result[idx] = map.get(arr[idx]);
        }
        return result;
    }


}
