package org.alking.p300;

public class P303 {

    public static class NumArray {

        private final int[] sumArr;

        public NumArray(int[] nums) {
            sumArr = new int[nums.length];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                sumArr[i] = sum;
            }
        }

        public int sumRange(int i, int j) {
            int sumLeft = i > 0 ? sumArr[i - 1] : 0;
            int sumRight = sumArr[j];
            return sumRight - sumLeft;
        }
    }


}
