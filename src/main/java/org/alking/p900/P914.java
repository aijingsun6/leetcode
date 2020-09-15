package org.alking.p900;

import java.util.HashMap;
import java.util.Map;

public class P914 {

    public boolean hasGroupsSizeX(int[] deck) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int v : deck) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        if(map.size() == 0){
            return false;
        }

        boolean init = false;
        int gcd = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (!init) {
                init = true;
                gcd = entry.getValue();
                continue;
            }

            int v = entry.getValue();

             gcd = gcd(gcd, v);

            if (gcd == 1) {
                return false;
            }
        }

        return gcd > 1;

    }

    private int gcd(int m, int n) {
        int result = 0;
        while (n != 0) {
            result = m % n;
            m = n;
            n = result;
        }
        return m;
    }
}
