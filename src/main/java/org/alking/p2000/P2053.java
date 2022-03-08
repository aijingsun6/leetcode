package org.alking.p2000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P2053 {

    public String kthDistinct(String[] arr, int k) {
        HashMap<String, int[]> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (map.containsKey(s)) {
                int[] cc = map.get(s);
                cc[1]++;
            } else {
                map.put(s, new int[]{i, 1});
            }
        }
        PriorityQueue<Map.Entry<String, int[]>> q = new PriorityQueue<>(new Comparator<Map.Entry<String, int[]>>() {
            @Override
            public int compare(Map.Entry<String, int[]> o1, Map.Entry<String, int[]> o2) {
                return o1.getValue()[0] - o2.getValue()[0];
            }
        });

        for (Map.Entry<String, int[]> e : map.entrySet()) {
            if (e.getValue()[1] < 2) {
                q.offer(e);
            }
        }

        for (int i = 0; i < (k - 1); i++) {
            if (!q.isEmpty()) {
                q.poll();
            }
        }
        if (!q.isEmpty()) {
            return q.peek().getKey();
        }
        return "";
    }
}
