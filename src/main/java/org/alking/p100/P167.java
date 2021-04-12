package org.alking.p100;

public class P167 {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int vleft = numbers[left];
            int vright = numbers[right];
            int total = vleft + vright;
            if (total < target) {
                left++;
            } else if (total > target) {
                right--;
            } else {
                return new int[]{left+1, right+1};
            }

        }
        return null;
    }
}
