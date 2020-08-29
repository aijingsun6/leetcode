package org.alking.p1700;

import java.util.HashMap;

public class P1748 {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int v;
        int half = nums.length / 2;
        for (int i : nums) {

            v = map.getOrDefault(i, 0) + 1;
            if(v > half){
                return i;
            }
            map.put(i, v);
        }
        return -1;

    }
}
