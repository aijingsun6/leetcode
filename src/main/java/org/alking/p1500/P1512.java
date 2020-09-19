package org.alking.p1500;

public class P1512 {

    public int numIdenticalPairs(int[] nums) {

        int[] cache = new int[101];
        int sum = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            int v = nums[idx];
            sum += cache[v];
            cache[v] += 1;
        }
        return sum;
    }
}
