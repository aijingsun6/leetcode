package org.alking.p100;

public class P162 {

    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid+1 < nums.length && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return left;
    }
}
