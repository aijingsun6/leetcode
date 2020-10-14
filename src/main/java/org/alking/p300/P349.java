package org.alking.p300;

import java.util.Arrays;

public class P349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums1 == null || nums1.length == 0) {
            return new int[0];
        }

        if (nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] acc = new int[nums1.length];
        int idx = 0;

        int idx1 = 0;
        int v1;

        int idx2 = 0;
        int v2;

        while (idx1 < nums1.length && idx2 < nums2.length) {
            v1 = nums1[idx1];
            v2 = nums2[idx2];
            if (v1 == v2) {
                if (idx > 0 && acc[idx - 1] != v1) {
                    acc[idx] = v1;
                    idx++;
                } else if (idx < 1) {
                    acc[idx] = v1;
                    idx++;
                }

                idx1++;
                idx2++;
            } else if (v1 < v2) {
                idx1++;
            } else {
                idx2++;
            }

        }
        return Arrays.copyOf(acc,idx);
    }


}
