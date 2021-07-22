package org.alking.p300;

public class P334 {

    public boolean increasingTriplet(int[] nums) {

        int len = nums.length;
        if (len < 3) return false;
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= mid) {
                mid = num;
            } else  {
                return true;
            }
        }
        return false;

    }
}
