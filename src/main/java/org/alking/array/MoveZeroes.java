package org.alking.array;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int max = nums.length;

        for (int i = 0; i < max; i++) {

            if (nums[i] == 0) {

                for (int j = i; j < max - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[max - 1] = 0;
                max = max - 1;
                i = i -1;
            }
        }

    }

}
