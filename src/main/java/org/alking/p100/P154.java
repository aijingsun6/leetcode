package org.alking.p100;

public class P154 {

    /**
     * 本质上是找到拐点
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            while (left + 1 < right && nums[left] == nums[left + 1]) {
                left = left + 1;
            }
            while (right - 1 > left && nums[right] == nums[right - 1]) {
                right = right - 1;
            }
            mid = left + (right - left) / 2;
            if (nums[left] <= nums[mid] && nums[mid] <= nums[right]) {
                // 递增区间
                return nums[left];
            }
            if (nums[left] <= nums[mid]) {
                // mid 在 left和拐点之间
                left = mid + 1;
                continue;
            }
            right = mid;

        }
        return nums[left];
    }

}
