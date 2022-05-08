package org.alking.p1400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P1442 {

    public int countTriplets(int[] arr) {
        int acc = 0;
        int sum = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(-1);
        map.put(0, first);
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
            List<Integer> p = map.getOrDefault(sum, new ArrayList<>());
            if (!p.isEmpty()) {
                for (int idx : p) {
                    acc = acc + i - idx - 1;
                }
            }
            p.add(i);
            map.put(sum, p);
        }
        return acc;
    }

    public int countTriplets2(int[] arr) {
        int acc = 0;
        int sum = 0;

        // sum -> cnt
        HashMap<Integer, Integer> cntMap = new HashMap<>();
        // sum -> total
        HashMap<Integer, Integer> totalMap = new HashMap<>();

        cntMap.put(0, 1);
        totalMap.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
            if(cntMap.containsKey(sum)){
                int cnt = cntMap.get(sum);
                int total = totalMap.get(sum);
                // Sum(i - idx - 1) = (i -idx1-1) + (i -idx2-1) + ... (i - idxCnt -1)
                // i * Cnt - (idx1 + idx2 +...idxCnt) - Cnt
                int add = cnt * i - total - cnt;
                acc += add;
                cntMap.put(sum, cnt + 1);
                totalMap.put(sum, total + i);
            }else {
                cntMap.put(sum, 1);
                totalMap.put(sum, i);
            }
        }
        return acc;
    }


}
