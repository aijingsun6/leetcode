package org.alking.p400;

import java.util.*;

public class P451 {

    public String frequencySort(String s) {

        HashMap<Character, Integer> cntMap = new HashMap<>();
        int N = s.length();
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            cntMap.put(c, cntMap.getOrDefault(c, 0) + 1);
        }

        final PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<Map.Entry<Character, Integer>>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        cntMap.entrySet().forEach(x -> q.add(x));

        char[] arr = new char[N];
        int idx = 0;
        while (!q.isEmpty()) {
            Map.Entry<Character, Integer> e = q.poll();
            Arrays.fill(arr, idx, idx + e.getValue(), e.getKey());
            idx += e.getValue();
        }
        return new String(arr);
    }

}
