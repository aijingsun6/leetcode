package org.alking.p500;

import java.util.Arrays;

public class P525 {

    public int findMaxLength(int[] nums) {

        int N = nums.length;
        int[] cache = new int[N * 2 + 1];
        Arrays.fill(cache, -2);
        int result = 0;
        // count = N + count(0) - count(1)
        int count = N;
        cache[count] = -1;
        int add;
        for (int i = 0; i < N; i++) {
            add = nums[i] == 0 ? 1 : -1;
            count += add;
            if (cache[count] > -2) {
                result = Math.max(result, i - cache[count]);
            } else {
                cache[count] = i;
            }
        }
        return result;
    }
}
