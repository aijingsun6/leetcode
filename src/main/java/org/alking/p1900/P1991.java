package org.alking.p1900;

import java.util.Arrays;

public class P1991 {

    public int findMiddleIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum * 2 + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
