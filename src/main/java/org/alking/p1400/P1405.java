package org.alking.p1400;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P1405 {
    public String longestDiverseString(int a, int b, int c) {
        int[] buf = new int[a + b + c];
        int idx = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        if(a > 0){
            q.offer(new int[]{a, 0});
        }
        if(b > 0){
            q.offer(new int[]{b, 1});
        }
        if(c > 0){
            q.offer(new int[]{c, 2});
        }
        while (!q.isEmpty()) {
            int[] p = q.poll();
            int cc = p[1];
            if (idx > 1 && buf[idx - 1] == cc && buf[idx - 2] == cc) {
                if (q.isEmpty()) {
                    break;
                } else {
                    int[] p2 = q.poll();
                    buf[idx++] = p2[1];
                    if (--p2[0] > 0) {
                        q.offer(p2);
                    }
                    q.offer(p);
                }
            } else {
                buf[idx++] = p[1];
                if (--p[0] > 0) {
                    q.offer(p);
                }
            }
        }
        char[] arr = new char[idx];
        for (int i = 0; i < idx; i++) {
            arr[i] = (char) (buf[i] + 'a');
        }
        return new String(arr);
    }
}
