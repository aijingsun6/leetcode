package org.alking.p1600;


public class P1608 {

    public int specialArray(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        int[] counts = new int[maxVal + 1];
        for (int num : nums) {
            counts[num] += 1;
        }

        int sum = 0;
        for (int i = maxVal; i >= 0; i--) {
            sum += counts[i];
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }

}
