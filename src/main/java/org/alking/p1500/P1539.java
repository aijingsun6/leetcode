package org.alking.p1500;

public class P1539 {

    public int findKthPositive(int[] arr, int k) {

        if (arr == null || arr.length < 1) {
            return k;
        }
        int firstMissCnt = arr[0] - 1;
        if (firstMissCnt >= k) {
            return k;
        }

        //int[] missArr = new int[arr.length];
        int missCnt = 0;
        for (int idx = 1; idx < arr.length; idx++) {
            missCnt = arr[idx] - idx - 1;
            //missArr[idx] = missCnt;
            if (missCnt >= k) {
                return arr[idx] - missCnt + k - 1;
            }
        }
        return arr[arr.length-1] + (k -missCnt);
    }

}
