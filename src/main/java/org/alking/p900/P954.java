package org.alking.p900;

import java.util.HashMap;
import java.util.Map;

public class P954 {

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
        if(even.containsKey(0) && (even.getOrDefault(0,0) %2 > 0)){
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
