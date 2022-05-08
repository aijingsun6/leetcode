package org.alking.offer;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
public class O21 {

    public int[] exchange(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {

            // 找到偶数
            while (left < right && nums[left] % 2 == 1) {
                left++;
            }

            // 找到奇数
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
            }

        }
        return nums;
    }
}
