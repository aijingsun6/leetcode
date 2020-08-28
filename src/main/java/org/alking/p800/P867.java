package org.alking.p800;

/**
 *  <a href="https://leetcode-cn.com/problems/transpose-matrix">https://leetcode-cn.com/problems/transpose-matrix/</a>
 */
public class P867 {

    public int[][] transpose(int[][] A) {
        int iMax = A.length;
        int jMax = A[0].length;
        int[][] result = new int[jMax][iMax];

        for(int i = 0; i < iMax; i++){
            for(int j = 0;  j < jMax;j++){
                result[j][i] = A[i][j];
            }
        }
        return result;

    }
}
