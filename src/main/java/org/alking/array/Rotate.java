package org.alking.array;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        for (int i = 0; i < k; i++) {
            int tmp = nums[size - 1];
            for (int j = size - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}
