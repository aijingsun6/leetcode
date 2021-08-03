package org.alking.p500;

public class P581 {

    public int findUnsortedSubarray(int[] nums) {

        if (nums == null || nums.length < 1) {
            return 0;
        }
        final int N = nums.length;

        // find right ptr
        int[] maxArray = new int[N];
        int max = nums[0];
        for (int i = 0; i < N; i++) {
            max = Math.max(max, nums[i]);
            maxArray[i] = max;
        }
        int rightPtr = N - 1;
        while (rightPtr > 0 && nums[rightPtr] >= maxArray[rightPtr - 1]) {
            rightPtr--;
        }

        // find left ptr
        int[] minArray = new int[N];
        int min = nums[N - 1];
        for (int i = N - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            minArray[i] = min;
        }
        int leftPtr = 0;
        while (leftPtr < N - 1 && nums[leftPtr] <= minArray[leftPtr + 1]) {
            leftPtr++;
        }

        if (leftPtr >= rightPtr) {
            return 0;
        }
        return rightPtr - leftPtr + 1;
    }

}
