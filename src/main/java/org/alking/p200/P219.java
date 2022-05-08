package org.alking.p200;

import java.util.HashMap;

public class P219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            int prev = map.getOrDefault(v, -1);
            if (prev != -1 && i - prev <= k) {
                return true;
            }
            map.put(v, i);

        }
        return false;
    }
}
