package org.alking.p600;

import java.util.Arrays;

public class P611 {

    public int triangleNumber(int[] nums) {

        if (nums == null || nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);
        final int N = nums.length;
        int acc = 0;
        // i: [0,N-2)
        // j: [i+1,N-1)
        // k: [j+1,N)

        for (int i = 0; i < N - 2; i++) {
            int k = i + 1;
            for (int j = i + 1; j < N - 1; j++) {
                // nums[i] + nums[j] > nums[k]
                k = Math.max(k,j+1);
                while (k < N && nums[k] < (nums[i] + nums[j])) {
                    k++;
                }
                // [j+1,k)
                int count = k - (j + 1);
                acc += count;
            }

        }
        return acc;
    }
}
