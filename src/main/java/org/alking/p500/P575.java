package org.alking.p500;

import java.util.HashSet;

public class P575 {

    public int distributeCandies(int[] candies) {

        if (candies == null || candies.length == 0) {
            return 0;
        }
        int max = candies.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int v: candies){
            set.add(v);
        }
        if(set.size() >= max){
            return max;
        }
        return set.size();
    }
}
