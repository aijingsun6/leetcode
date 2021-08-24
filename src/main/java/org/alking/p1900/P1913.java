package org.alking.p1900;

public class P1913 {

    public int maxProductDifference(int[] nums) {

        int[] min = nums[0] < nums[1] ? new int[]{nums[0], nums[1]} : new int[]{nums[1], nums[0]};
        int[] max = nums[0] > nums[1] ? new int[]{nums[0], nums[1]} : new int[]{nums[1], nums[0]};

        for (int i = 2; i < nums.length; i++) {
            int v = nums[i];
            if (v > max[0]) {
                max[1] = max[0];
                max[0] = v;
            } else if (v > max[1]) {
                max[1] = v;
            }

            if (v < min[0]) {
                min[1] = min[0];
                min[0] = v;
            } else if (v < min[1]) {
                min[1] = v;
            }
        }

        return max[0] * max[1] - min[0] * min[1];
    }
}
