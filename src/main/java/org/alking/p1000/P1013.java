package org.alking.p1000;

/**
 * <a href="https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/">1013. 将数组分成和相等的三个部分</a>
 */
public class P1013 {

    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        for (int v : A) {
            sum += v;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int part = sum / 3;
        int size = A.length;
        int sum1 = 0;
        int idx1 = -1;
        for (int i = 0; i < size; i++) {
            sum1 += A[i];
            if (sum1 == part) {
                idx1 = i;
                break;
            }
        }

        int sum2 = 0;
        int idx2 = -1;
        for (int j = size - 1;j > 0; j-- ){
            sum2 += A[j];
            if(sum2 == part){
                idx2 = j;
                break;
            }
        }

        if(idx1 > -1 && idx2 > -1 && idx1 < idx2-1){
            return true;
        }
        return false;
    }
}
