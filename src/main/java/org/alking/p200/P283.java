package org.alking.p200;

public class P283 {

    public void moveZeroes(int[] nums) {

        if (nums == null || nums.length < 2) {
            return;
        }
        int left = 0;
        int right = 0;
        while (left < nums.length) {
            if (nums[left] == 0) {
                right = Math.max(left,right);
                while (right < nums.length && nums[right] == 0) {
                    right++;
                }
                if(right >= nums.length){
                    break;
                }
                nums[left] = nums[right];
                nums[right] = 0;
            }
            left++;
        }
    }
}
