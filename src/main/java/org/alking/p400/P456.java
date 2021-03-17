package org.alking.p400;

import java.util.ArrayDeque;
import java.util.Deque;

public class P456 {

    public boolean find132pattern(int[] nums) {

        if (nums == null || nums.length < 3) {
            return false;
        }
        int n = nums.length;
        Deque<Integer> d = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < k) return true;
            while (!d.isEmpty() && d.peekLast() < nums[i]) {
                // 事实上，k 的变化也具有单调性，直接使用 k = pollLast() 也是可以的
                k = Math.max(k, d.pollLast());
            }
            d.addLast(nums[i]);
        }
        return false;


    }


}
