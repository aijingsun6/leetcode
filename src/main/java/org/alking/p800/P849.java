package org.alking.p800;


import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/maximize-distance-to-closest-person/
 */
public class P849 {

    public int maxDistToClosest(int[] seats) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int idx = 0; idx < seats.length; idx++) {
            if (seats[idx] > 0) {
                list.add(idx);
            }
        }

        int max = 0;
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int start = list.get(i);
            int end = list.get(i + 1);
            for (int p = start + 1; p < end; p++) {
                int min = Math.min(p - start, end - p);
                max = Math.max(max, min);
            }
        }

        max = Math.max(max, list.get(0));
        max = Math.max(max, seats.length - list.get(size - 1)-1);
        return max;
    }
}
