package org.alking.p1400;

public class P1437 {

    public boolean kLengthApart(int[] nums, int k) {

        int last = -1;
        int idx = 0;
        int size = nums.length;
        while (idx < size) {

            while (idx < size && nums[idx] == 0) {
                idx++;
            }

            if (idx < size) {
                if (idx - last <= k && last > -1) {
                    return false;
                }
                last = idx;
            }

            idx += 1;

        }
        return true;
    }

}
