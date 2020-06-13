package org.alking.array;


public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // loop idx for num2
        int i = 0;

        // loop idx for num1
        int j = 0;

        while (i < n) {
            if (nums2[i] < nums1[j]) {
                // insert
                for(int k = m; k > j; k--){
                    nums1[k] = nums1[k-1];
                }
                nums1[j] = nums2[i];
                i += 1;
                m += 1;
            }
            j += 1;
            if(j == m){
                System.arraycopy(nums2,i,nums1,m,n-i);
                break;
            }

        }

    }
}
