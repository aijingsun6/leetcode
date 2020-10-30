package org.alking.p400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P401 {

    public List<String> readBinaryWatch(int num) {
        int[] hourArr = new int[]{8, 4, 2, 1};
        int hourMax = 11;
        int[] minArr = new int[]{32, 16, 8, 4, 2, 1};
        int minMax = 59;
        ArrayList<String> acc = new ArrayList<>();
        for (int h = 0; h <= num; h++) {
            int m = num - h;
            if (h <= hourArr.length && m >= 0 && m <= minArr.length) {
                List<Integer> ha = gen(hourArr, h, hourMax);
                List<Integer> ma = gen(minArr, m, minMax);
                for (Integer hs : ha) {
                    for (Integer ms : ma) {
                        acc.add(String.format("%1d:%02d", hs, ms));
                    }
                }
            }

        }
        return acc;
    }

    private List<Integer> gen(int[] arr, int num, int max) {
        if (num < 0) {
            return Collections.emptyList();
        }


        ArrayList<Integer> acc = new ArrayList<>();
        if (num == 0) {
            acc.add(0);
            return acc;
        }
        dfs(arr, num, 0, 0, max, acc);
        return acc;

    }

    private void dfs(int[] arr, int left, int from, int sum, int max, List<Integer> acc) {
        if (left == 0) {
            if (sum <= max) {
                acc.add(sum);
            }
            return;
        }
        for (int i = from; i < arr.length; i++) {
            dfs(arr, left - 1, i + 1, sum + arr[i], max, acc);
        }
    }

}
