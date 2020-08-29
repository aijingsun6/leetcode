package org.alking.p1700;

import java.util.HashMap;
import java.util.Map;

public class P1759 {

    public int trap(int[] height) {

        if (height == null || height.length == 0) {
            return 0;
        }
        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        int size = height.length;
        int leftMax = height[0];
        int rightMax = height[size - 1];
        int rightIdx = 0;
        for (int i = 0; i < size; i++) {
            leftMax = Math.max(leftMax, height[i]);
            leftMap.put(i, leftMax);

            rightIdx = size - 1 - i;
            rightMax = Math.max(rightMax, height[rightIdx]);
            rightMap.put(rightIdx, rightMax);
        }

        int left;
        int right;
        int min;
        int sum = 0;
        for (int i = 0; i < size; i++) {

            left = leftMap.getOrDefault(i - 1, 0);
            right = rightMap.getOrDefault(i + 1, 0);
            min = Math.min(left, right);
            sum += Math.max(0, min - height[i]);

        }
        return sum;
    }

}
