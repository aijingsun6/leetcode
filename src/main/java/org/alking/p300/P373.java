package org.alking.p300;

import java.util.*;

public class P373 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k < 1) {
            return result;
        }
        int count = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                if(j == 0){
                    while (!q.isEmpty() && q.peek()[0] <= sum && count < k) {
                        int[] pop = q.poll();
                        result.add(Arrays.asList(pop[1], pop[2]));
                        count++;
                    }
                }
                if (count >= k) {
                    break;
                }
                q.offer(new int[]{sum, nums1[i], nums2[j]});
            }
            if (count >= k) {
                break;
            }
        }
        while (!q.isEmpty() && count < k){
            int[] pop = q.poll();
            result.add(Arrays.asList(pop[1], pop[2]));
            count++;
        }

        return result;
    }
}
