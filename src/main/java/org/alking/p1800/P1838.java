package org.alking.p1800;

import java.util.Arrays;

public class P1838 {

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] preSumArray = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            preSumArray[i + 1] = sum;
        }
        int left = 0;
        int right = 1;
        int max = 1;
        while (left < right && right < n) {
            long gap = nums[right] * (right - left) - (preSumArray[right] - preSumArray[left]);
            while (gap > k){
                gap -= nums[right]-nums[left];
                left += 1;
            }
            max = Math.max(max, right - left + 1);
            right += 1;

        }
        return max;
    }
}
