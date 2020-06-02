package org.alking.array;

import java.util.Arrays;
import java.util.LinkedList;

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        LinkedList<Integer> acc = new LinkedList<>();

        int i = 0;
        int j = 0;
        while (true) {

            if (i >= nums1.length || j >= nums2.length) {
                break;
            }
            if (nums1[i] < nums2[j]) {
                i = i + 1;
            } else if (nums1[i] > nums2[j]) {
                j = j + 1;
            } else {
                acc.add(nums1[i]);
                i = i + 1;
                j = j + 1;
            }
        }
        int[] ret = new int[acc.size()];
        int idx = 0;
        for (int v : acc) {
            ret[idx] = v;
            idx += 1;
        }
        return ret;
    }
}
