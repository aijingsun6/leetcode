package org.alking.p400;

import java.util.Arrays;

public class P454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        int acc = 0;
        for (int i = 0; i < A.length; i++) {
            int vA = A[i];

            if (vA + B[B.length - 1] + C[C.length - 1] + D[D.length - 1] < 0) {
                // A[i] too small
                continue;
            }
            if (vA + B[0] + C[0] + D[0] > 0) {
                // vA too large
                break;
            }


            for (int j = 0; j < B.length; j++) {
                int vB = B[j];
                if (vA + vB + C[C.length - 1] + D[D.length - 1] < 0) {
                    // vB too small
                    continue;
                }
                if (vA + vB + C[0] + D[0] > 0) {
                    // vB too large
                    break;
                }

                //
                int left = -vA - vB;
                int m = 0;
                int n = D.length - 1;
                int vC;
                int vD;
                int sum;

                while (m < C.length && n >= 0) {
                    vC = C[m];
                    vD = D[n];
                    sum = vC + vD;
                    if (sum > left) {
                        while (n >= 0 && D[n] == vD) {
                            n--;
                        }
                    } else if (sum < left) {
                        while (m < C.length && C[m] == vC) {
                            m++;
                        }
                    } else {
                        int cntC = 0;
                        int cntD = 0;
                        while (n >= 0 && D[n] == vD) {
                            n--;
                            cntD++;
                        }
                        while (m < C.length && C[m] == vC) {
                            m++;
                            cntC++;
                        }
                        acc += cntC * cntD;
                    }
                }

            }
        }
        return acc;
    }


}
