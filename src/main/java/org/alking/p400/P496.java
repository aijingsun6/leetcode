package org.alking.p400;

import java.util.Arrays;
import java.util.PriorityQueue;


public class P496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1==null || nums1.length == 0){
            return nums1;
        }
        int[] res = new int[nums1.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int min = nums2[0];
        int max = nums2[0];
        for(int v2: nums2){
            min = Math.min(min,v2);
            max = Math.max(max,v2);
        }

        int[] cache = new int[max-min+1];
        Arrays.fill(cache,-1);
        int v;
        int first;
        for (int i = 0; i < nums2.length; i++) {
            v = nums2[i];
            while (!queue.isEmpty() && queue.peek() < v) {
                first = queue.poll();
                cache[first-min] = v;
            }
            queue.add(v);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = cache[nums1[i]-min];
        }
        return res;
    }
}
