package org.alking.other;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int[] acc = new int[nums.length+1];
        for (int n : nums) {
            acc[n] += 1;
        }
        for (int idx = 0; idx < acc.length; idx++) {
            if (acc[idx] == 0) {
                return idx;
            }
        }
        return 0;

    }
}
