package org.alking.p400;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P480 {

    public double[] medianSlidingWindow(int[] nums, int k) {

        boolean even = k % 2 == 0;
        double[] result = new double[nums.length - k + 1];

        PriorityQueue<Long> left = new PriorityQueue<Long>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                long c = o2 - o1;
                if (c < 0) {
                    return -1;
                } else if (c > 0) {
                    return 1;
                }
                return 0;
            }
        });
        PriorityQueue<Long> right = new PriorityQueue<Long>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                long c = o1 - o2;
                if (c < 0) {
                    return -1;
                } else if (c > 0) {
                    return 1;
                }
                return 0;
            }
        });

        for (int i = 0; i < k; i++) {
            left.offer((long)nums[i]);
        }
        result[0] = calcValue(even, left, right);

        for (int i = k; i < nums.length; i++) {
            Long remove = (long)nums[i - k];
            Long add = (long)nums[i];
            Long mid = left.peek();
            if (remove <= mid) {
                left.remove(remove);
            } else {
                right.remove(remove);
            }
            if (add < mid) {
                left.offer(add);
            } else {
                right.offer(add);
            }
            int idx = i - k + 1;
            result[idx] = calcValue(even, left, right);
        }
        return result;
    }

    private double calcValue(boolean even, PriorityQueue<Long> left, PriorityQueue<Long> right) {

        balance(left, right);
        if (even) {
            return ((double) left.peek() + (double) right.peek()) / 2;
        }
        return left.peek();
    }

    /**
     * 调整连个堆，使得元素个数相等，或者左边比右边个数大1
     * 左边大顶推
     * 右边小顶堆
     */
    private void balance(PriorityQueue<Long> left, PriorityQueue<Long> right) {

        while (left.size() - right.size() > 1) {
            Long p = left.poll();
            right.offer(p);
        }

        while (right.size() > left.size()) {
            Long p = right.poll();
            left.offer(p);
        }

    }

}
