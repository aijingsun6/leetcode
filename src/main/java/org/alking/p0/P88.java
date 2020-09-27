package org.alking.p0;


public class P88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] tmp = new int[nums1.length];

        int idx1 = 0;

        int idx2 = 0;

        int idx = 0;

        while (idx1 < m && idx2 < n) {

            if (nums1[idx1] < nums2[idx2]) {

                tmp[idx] = nums1[idx1];
                idx += 1;
                idx1 += 1;
            } else {
                tmp[idx] = nums2[idx2];
                idx += 1;
                idx2 += 1;
            }

        }

        if (idx1 < m) {
            System.arraycopy(nums1, idx1, nums1, idx, m - idx1);
        }
        if (idx2 < n) {
            System.arraycopy(nums2, idx2, nums1, idx, n - idx2);
        }

        System.arraycopy(tmp, 0, nums1, 0, idx);
    }
}
