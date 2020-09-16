package org.alking.p1600;

public class P1607 {

    public int findRepeatNumber(int[] nums) {

        boolean[] array = new boolean[nums.length + 1];

        for (int v : nums) {
            if (array[v]) {
                return v;
            }
            array[v] = true;
        }
        return -1;
    }
}
