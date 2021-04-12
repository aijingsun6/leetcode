package org.alking.p300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P368 {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        if (nums == null || nums.length < 1) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        int size = nums.length;
        ArrayList<Integer>[] dp = new ArrayList[size];
        dp[0] = new ArrayList<>();
        dp[0].add(nums[0]);

        List<Integer> result = dp[0];
        int maxSize = 0;
        int maxIdx = 0;
        for (int i = 1; i < size; i++) {
            int idx = -1;
            int count = 0;
            int value = nums[i];

            for (int j = i-1; j >= 0; j--) {
                if (value % nums[j] == 0) {
                    int jsize = dp[j].size();
                    if (jsize > count) {
                        idx = j;
                        count = jsize;
                    }
                    if (jsize == maxSize && maxIdx == j) {
                        break;
                    }
                }
            }
            ArrayList<Integer> list;
            if (idx > -1) {
                list = new ArrayList<>(dp[idx]);
            } else {
                list = new ArrayList<>();
            }
            list.add(value);
            dp[i] = list;
            count += 1;
            if (count > maxSize) {
                maxSize = count;
                maxIdx = i;
                result = list;
            }
        }
        return result;
    }

}
