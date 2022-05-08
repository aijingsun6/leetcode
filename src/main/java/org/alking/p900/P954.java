package org.alking.p900;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P954 {

    public boolean canReorderDoubled2(int[] arr) {

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int v : arr) {
            m.put(v, m.getOrDefault(v, 0) + 1);
        }
        if (m.containsKey(0) && (m.getOrDefault(0, 0) % 2 > 0)) {
            return false;
        }
        m.remove(0);
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            q.offer(e.getKey());
        }

        while (!q.isEmpty()) {
            int p = q.poll();
            int c = m.getOrDefault(p,0);
            if(c < 1){
                continue;
            }
            int p2 = p * 2;
            int c2 = m.getOrDefault(p2,0);
            if(c2 < c){
                return false;
            }else if(c2 > c){
                m.put(p2,c2 - c);
            }else{
                m.remove(p2);
            }
        }
        return true;
    }

    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> even = new HashMap<>();
        HashMap<Integer, Integer> odd = new HashMap<>();
        for (int v : arr) {
            if ((v % 2) == 0) {
                even.put(v, even.getOrDefault(v, 0) + 1);
            } else {
                odd.put(v, odd.getOrDefault(v, 0) + 1);
            }
        }
        // check zero
        if (even.containsKey(0) && (even.getOrDefault(0, 0) % 2 > 0)) {
            return false;
        }
        even.remove(0);

        while (!odd.isEmpty() || !even.isEmpty()) {
            // 过滤调奇数
            for (Map.Entry<Integer, Integer> e : odd.entrySet()) {
                int v = e.getKey() * 2;
                int c = e.getValue();
                int ec = even.getOrDefault(v, 0);
                if (ec < c) {
                    return false;
                } else if (ec > c) {
                    even.put(v, ec - c);
                } else {
                    even.remove(v);
                }
            }

            odd.clear();


            while (odd.isEmpty()) {

                if (even.isEmpty()) {
                    return true;
                }

                HashMap<Integer, Integer> tmp = new HashMap<>();
                for (Map.Entry<Integer, Integer> e : even.entrySet()) {
                    int k = e.getKey() / 2;
                    if (k % 2 == 0) {
                        tmp.put(k, e.getValue());
                    } else {
                        odd.put(k, e.getValue());
                    }
                }
                even = tmp;
            }
        }
        return true;
    }
}
