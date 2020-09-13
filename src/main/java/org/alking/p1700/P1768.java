package org.alking.p1700;

public class P1768 {

    public int missingNumber(int[] nums) {
        int sum = (nums.length + 1) * nums.length / 2;
        int arraySum = 0;
        for (int i = 0; i < nums.length; i++) arraySum += nums[i];
        return sum - arraySum;
    }
}
