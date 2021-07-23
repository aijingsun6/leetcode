package org.alking.p900;

public class P912 {

    public int[] sortArray(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int size = max - min + 1;

        int[] bucket = new int[size];
        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i] - min;
            bucket[idx]++;
        }

        int[] result = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < bucket.length; i++) {

            for (int j = 0; j < bucket[i]; j++) {

                result[idx++] = min + i;
            }
        }

        return result;
    }
}
