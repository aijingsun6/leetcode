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
                    acc = acc + i - idx -1;
                }
            }
            p.add(i);
            map.put(sum, p);
        }
        return acc;
    }
}
