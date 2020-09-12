package org.alking.p1600;

public class P1651 {

    public int missingNumber(int[] nums) {

        int size = nums.length;

        int sum = size * (size + 1) / 2;

        int calcSum = 0;
        for(int v: nums){
            calcSum += v;
        }
        return sum - calcSum;

    }
}
