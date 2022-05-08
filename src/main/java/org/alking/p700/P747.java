package org.alking.p700;

public class P747 {

    public int dominantIndex(int[] nums) {

        if (nums == null || nums.length < 2) {
            return 0;
        }

        // max[0] > max[1]
        int[] max = new int[2];
        int[] idx = new int[2];
        for (int i = 0; i < nums.length; i++) {

            int v = nums[i];
            if (v <= max[1]) {
                continue;
            }
            if (v <= max[0]) {
                max[1] = v;
                idx[1] = i;
                continue;
            }
            max[1] = max[0];
            max[0] = v;
            idx[1] = idx[0];
            idx[0] = i;
        }
        return max[1] * 2 <= max[0] ? idx[0] : -1;
    }
}
