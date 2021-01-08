package org.alking.p100;

public class P189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] tmp = new int[n * 2];
        k = k % n;
        System.arraycopy(nums, 0, tmp, k, n);
        System.arraycopy(tmp, 0, nums, 0, n);
        System.arraycopy(tmp, n, nums, 0, k);
    }

}
