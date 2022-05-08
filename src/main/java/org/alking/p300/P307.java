package org.alking.p300;

public class P307 {

    static class NumArray {

        private int[] presum;
        private int[] nums;

        public NumArray(int[] nums) {
            presum = new int[nums.length + 1];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                presum[i + 1] = sum;
            }
            this.nums = nums;

        }

        public void update(int index, int val) {
            int sum = presum[index];
            nums[index] = val;
            for (int i = index; i < nums.length; i++) {
                sum += nums[i];
                presum[i + 1] = sum;
            }
        }

        public int sumRange(int left, int right) {

            return this.presum[right + 1] - this.presum[left];
        }
    }
}
