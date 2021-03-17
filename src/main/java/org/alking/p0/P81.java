package org.alking.p0;

/**
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/
 */
public class P81 {

    public boolean search(int[] nums, int target) {

        if (nums == null || nums.length < 1) {
            return false;
        }
        // 1. 先找到翻转点
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left +1 < right && nums[left] == nums[left+1]){
                left ++;
            }
            while (right -1 > left && nums[right-1] == nums[right]){
                right --;
            }

            int mid = left + (right - left) / 2;
            int midV = nums[mid];
            int leftV = nums[left];
            int rightV = nums[right];
            if (target == midV || target == leftV || target == rightV) {
                return true;
            }
            if (leftV <= target) {
                // target在翻转点左边
                if (midV < leftV) {
                    // mid 落在反转点右边
                    right = mid;
                } else if (midV < target) {
                    // mid 落在左边和target之间
                    left = mid + 1;
                } else {
                    // mid 落在 target 和反转点之间
                    right = mid;
                }
            } else {
                // target 在反转点右边
                if (midV > rightV) {
                    // mid 落在反转点左边
                    left = mid + 1;
                } else if (midV < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        if (left == right && nums[left] == target) {
            return true;
        }
        return false;
    }
}
