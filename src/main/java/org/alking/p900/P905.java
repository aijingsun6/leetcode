package org.alking.p900;

public class P905 {

    public int[] sortArrayByParity(int[] A) {

        if (A == null || A.length == 0) {
            return A;
        }

        int len = A.length;
        int[] odd = new int[len];
        int oddIdx = 0;

        int[] even = new int[len];
        int evenIdx = 0;

        for (int v : A) {

            if (v % 2 == 0) {
                even[evenIdx] = v;
                evenIdx += 1;
            }else {
                odd[oddIdx] = v;
                oddIdx += 1;
            }
        }

        System.arraycopy(even,0,A,0,evenIdx);
        System.arraycopy(odd,0,A,evenIdx,oddIdx);
        return A;

    }

}
