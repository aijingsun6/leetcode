package org.alking.p200;

public class P238 {

    public int[] productExceptSelf(int[] nums) {

        long max = 1;
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (v == 0) {
                zeroCnt += 1;
            } else {
                max = max * v;
            }

        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (zeroCnt == 0) {
                res[i] = (int) (max / v);
            } else if (zeroCnt == 1 && v == 0) {
                res[i] = (int) max;
            } else {
                res[i] = 0;
            }
        }
        return res;
    }
}
