package org.alking.p0;

import java.util.ArrayList;
import java.util.List;

public class P77 {

    public List<List<Integer>> combine(int n, int k) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return combine(array, 0, n - 1, k);
    }

    private List<List<Integer>> combine(int[] array, int start, int end, int k) {

        int maxCnt = end - start + 1;
        if (maxCnt < k) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        if (k == 1) {
            // 递归出口
            for (int i = start; i <= end; i++) {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(array[i]);
                result.add(a);
            }
            return result;
        }


        for (int i = end; i > start; i--) {
            // 做一次笛卡尔乘积
            List<List<Integer>> once = combine(array, start, i - 1, k - 1);
            if (once != null) {
                for (List<Integer> e : once) {
                    e.add(array[i]);
                }
                result.addAll(once);
            }
        }
        return result;
    }

}
