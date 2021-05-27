package org.alking.p400;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P451 {

    public String frequencySort(String s) {
        int size = 'z' - '0' + 1;
        int[] bucket = new int[size];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - '0';
            bucket[idx]++;
        }

        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        for (int i = 0; i < size; i++) {
            if (bucket[i] > 0) {
                q.offer(new int[]{i, bucket[i]});
            }
        }

        char[] arr = new char[s.length()];
        int offset = 0;
        while (!q.isEmpty()) {
            int[] e = q.poll();
            Arrays.fill(arr, offset, offset + e[1], (char)('0' + e[0]));
            offset += e[1];
        }
        return new String(arr);
    }

}
