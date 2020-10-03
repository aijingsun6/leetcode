package org.alking.p0;

import java.util.HashMap;

public class P1 {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {

            int v = nums[idx];
            int left = target - v;
            if(map.containsKey(left)){
                return new int[]{map.get(left),idx};
            }else {
                map.put(v,idx);
            }
        }
        return null;
    }
}
