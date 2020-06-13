package org.alking.dp;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {

    public int climbStairs(int n) {
        Map<Integer,Integer> cache = new HashMap<>();
        cache.put(1,1);
        cache.put(2,2);
        if(n < 3){
            return cache.get(n);
        }
        for(int i = 3; i <= n;i ++){
            int v = cache.get(i-1) + cache.get(i-2);
            cache.put(i,v);
        }
        return cache.get(n);
    }
}
